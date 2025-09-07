package Exercise6Operators;

import java.util.Scanner;

public class problem21BitwiseAnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1 = ");
        int num1 = input.nextInt();
        System.out.print("Enter num2 = ");
        int num2 = input.nextInt();

        int result = num1 & num2;    // AND Operator
        System.out.println("Result is " + result);
    }
}
