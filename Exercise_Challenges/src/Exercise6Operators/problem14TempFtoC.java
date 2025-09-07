package Exercise6Operators;

import java.util.Scanner;

public class problem14TempFtoC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Temperature in Fahrenheit F = ");
        float F = input.nextFloat();

        float C = (F - 32)*5f/9f;
        System.out.println("Temperature in Celsius C = " + C);
    }
}
