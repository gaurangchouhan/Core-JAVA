package Exercise11Loops_Recursion;

import java.util.Scanner;

public class problem69palindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.next();

        System.out.println("Your string is " + (isPalindrome(str) ? "Palindrome" : "Not Palindrome"));
    }

    public static boolean isPalindrome(String str){
        if (str.length() <= 1){
            return true;
        }
        int last = str.length()-1;
        if (str.charAt(0) != str.charAt(last)){
              return false;
        }
        String newStr = str. substring (1, last);
        return isPalindrome (newStr) ;
    }
}
