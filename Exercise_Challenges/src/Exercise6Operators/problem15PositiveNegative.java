package Exercise6Operators;

import java.util.Scanner;

public class problem15PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();

        if (a>0){
            System.out.println("positive");
        } else if (a<0) {
            System.out.println("negative");
        }
        else {
            System.out.println("Zero");
        }
    }
}
