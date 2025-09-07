package Exercise6Operators;

import java.util.Scanner;

public class problem8Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. x = ");
        double x = input.nextDouble();
        System.out.print("Enter no. y = ");
        double y = input.nextDouble();

        System.out.println("Addition: " + (x+y));
        System.out.println("Substraction: " + (x-y));
        System.out.println("Multiplication: " + (x*y));
        System.out.println("Division: " + (x/y));
        System.out.println("Modulus: " + (x%y));
    }
}
