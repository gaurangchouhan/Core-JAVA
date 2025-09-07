import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");

    }
}


/* Explanation */
/*
  *  %-15s → Print string (s1) left-justified, filling up 15 spaces.
  *  %03d  → Print integer (x) in 3 digits, pad with leading zeros if less than 100.
  *  %n    → New line (platform independent).

 */