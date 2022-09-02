import java.util.Scanner;
class PatternPrinter{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        patternPrinter(n);
               }
               static void patternPrinter(int n)
               {
//                my code begins here
                for (int r=n; r > 0; r--)
                {
                for (int j=n; j > 0; j--)
                {
                    for( int k = r; k > 0; k--)
                    {
                        System.out.print(j+" ");
                    }
                }
                    System.out.println();
                }
               }
}


