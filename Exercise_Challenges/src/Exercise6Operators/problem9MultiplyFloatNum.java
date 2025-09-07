package Exercise6Operators;

import java.util.Scanner;

public class problem9MultiplyFloatNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. a = ");
        float a = input.nextFloat();
        System.out.print("Enter no. b = ");
        float b = input.nextFloat();

        System.out.println("Product of two floating point: " + (a*b));
    }
}
