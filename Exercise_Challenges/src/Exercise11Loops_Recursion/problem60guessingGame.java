package Exercise11Loops_Recursion;

import java.util.Scanner;

public class problem60guessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 5, guess;
        do {
            System.out.print("Enter your guessed number: ");
            guess = sc.nextInt();
        }while (number != guess);
        System.out.println("your number is correct");
    }
}


