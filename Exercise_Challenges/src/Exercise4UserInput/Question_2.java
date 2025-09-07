package Exercise4UserInput;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number a: ");
        int a = input.nextInt();
        System.out.print("Enter number b: ");
        int b = input.nextInt();
        System.out.print("Sum: ");
        System.out.println(a+b);
    }
}
