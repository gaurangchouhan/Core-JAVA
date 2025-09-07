package Exercise6Operators;

import java.util.Scanner;

public class problem12SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Principle amount P = ");
        int p = input.nextInt();
        System.out.print("Rate of interest R = ");
        double r = input.nextDouble();
        System.out.print("Time T = ");
        double t = input.nextDouble();

        double simpleInterest = (p*r*t)/100;
        System.out.println("Simple Interest = " + simpleInterest);
    }
}
