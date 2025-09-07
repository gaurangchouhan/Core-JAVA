package Exercise6Operators;

import java.util.Scanner;

public class problem10PerimeterRect {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. A = ");
        int a = input.nextInt();
        System.out.print("Enter no. B = ");
        int b = input.nextInt();
        System.out.print("Enter no. C = ");
        int c = input.nextInt();
        System.out.print("Enter no. D = ");
        int d = input.nextInt();

        int perimeter = a + b + c + d;
        System.out.println("Perimeter of rectangle = " + perimeter);
    }
}
