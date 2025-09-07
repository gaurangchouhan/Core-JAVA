package Exercise10TernarySwitch;

import java.util.Scanner;

public class problem58Calcu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number = ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number = ");
        int num2 = sc.nextInt();
        System.out.print("Enter Operation = ");
        String operation = sc.next();

        int output = switch (operation){
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> -1;
        };
        System.out.println(output);
    }
}
