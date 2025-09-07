package Exercise6Operators;

import java.util.Scanner;

public class problem27BitwiseEvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1 = ");
        int num1 = input.nextInt();

        if ((num1 & 1) == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
