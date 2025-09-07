package Exercise10TernarySwitch;

import java.util.Scanner;

public class problem53TwoMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number = ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number = ");
        int num2 = sc.nextInt();

        int min = num1<num2 ? num1 : num2;
        System.out.println(min + " is the minimum number");
    }
}
