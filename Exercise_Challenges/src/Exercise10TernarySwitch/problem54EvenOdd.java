package Exercise10TernarySwitch;

import java.util.Scanner;

public class problem54EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int num = sc.nextInt();

        String guess = num%2==0 ? "Even" : "Odd";
        System.out.println(guess);
    }
}
