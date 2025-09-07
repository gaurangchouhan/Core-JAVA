package Exercise6Operators;

import java.util.Scanner;

public class problem18LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        if (a%4==0 || a%100==0 || a%400==0){
            System.out.println("Leap Year");
        }else {
            System.out.println("not a leap year");
        }
    }
}
