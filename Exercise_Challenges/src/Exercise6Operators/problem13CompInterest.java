package Exercise6Operators;

import java.util.Scanner;

public class problem13CompInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("numbers before swaping:");
        System.out.print("P = ");
        double a = sc.nextDouble();
        System.out.print("R = ");
        double b = sc.nextDouble();
        System.out.print("T = ");
        double c = sc.nextDouble();
        System.out.print("N = ");
        double d = sc.nextDouble();

        double base = (1 + b/d);
        double exponential = (d * c);
        double result = Math.pow(base, exponential);

        System.out.println("CI: " + a*result);
    }
}
