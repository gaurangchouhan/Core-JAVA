package Exercise6Operators;

import java.util.Scanner;

public class problem16EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();

        if (a%2==0){
            System.out.println("Even");
        }else {
            System.out.println("odd");
        }
    }
}
