package Exercise6Operators;

import java.util.Scanner;

public class problem13CompInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Principle amount P = ");
        int p = input.nextInt();
        System.out.print("Rate of interest R = ");
        double r = input.nextDouble();
        System.out.print("Time T = ");
        double t = input.nextDouble();

        double compoundInterest = p*(1+(r/100))*t;
        System.out.println("Compound Interest = " + compoundInterest);
    }
}
