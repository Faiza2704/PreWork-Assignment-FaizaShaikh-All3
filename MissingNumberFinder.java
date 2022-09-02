import java.util.Scanner;
class MissingNumberFinder{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size -1];
        for (int i = 0; i < size-1; i++) arr[i]  = in.nextInt();
        System.out.println(missingNumberFinder(arr, size));
    }
    static int missingNumberFinder(int array[], int n) {
//        My Code begins here
        int sumOfAll = (n*(n + 1))/2;
        int sumOfArray = 0;
        for (int i = 0; i <= n-2; i++) {
            sumOfArray = sumOfArray + array[i];
        }
        int missingNumber = sumOfAll - sumOfArray;
        System.out.println("Missing number is: ");
        return missingNumber;
    }
}