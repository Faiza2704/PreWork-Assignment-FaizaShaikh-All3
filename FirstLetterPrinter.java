import java.util.Scanner;
class FirstLetterPrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(firstLetterPrinter(input));
    }
    //str  = "Change the World By Being Yourself"
    static String firstLetterPrinter(String str) {
        // code begins here
        int len = str.length();
        char mus;
        String faiza = "";
        faiza = faiza + str.charAt(0);

        for (int i = 1; i < len; i++)
        {
            mus = str.charAt(i);
            if (mus == ' ') {
                faiza = faiza + (str.charAt(i + 1));
            }
        }
        System.out.println("The new word is: ");
        return faiza;
    }
}