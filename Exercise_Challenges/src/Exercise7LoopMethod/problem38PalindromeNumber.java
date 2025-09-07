package Exercise7LoopMethod;

import java.util.Scanner;

public class problem38PalindromeNumber {
    public static boolean isPalindrome(int N) {
        int finalNumber = 0;
        int copyNum = N;
        while (N>0){
            int newNum = N%10;
            finalNumber = finalNumber*10 + newNum;
            N /= 10;
        }
        return finalNumber == copyNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int num = sc.nextInt();

        boolean isPalindrome = isPalindrome(num);
        if (isPalindrome) {
            System.out.println("Your number is palindrome.");
        }else {
            System.out.println("Your number is not palindrome.");
        }
    }
}
