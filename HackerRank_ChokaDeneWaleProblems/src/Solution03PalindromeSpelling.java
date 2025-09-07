import java.util.Scanner;

public class Solution03PalindromeSpelling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String rev = "";
        int length = A.length();
        for(int i = length-1; i>=0; i--){
            rev = rev + A.charAt(i);
        }
        if(rev.equals(A)){
            System.out.print("Yes");
        }
    }
}
