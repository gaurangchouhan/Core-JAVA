package Exercise6Operators;

import java.util.Scanner;

public class problem25BitwiseLiftShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1 = ");
        int num1 = input.nextInt();


        int result =  num1 << 1   ;   // Lift Shift Operator
        System.out.println("Result is " + result);
    }
}
