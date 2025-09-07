package Exercise17ExceptionHandling;

import java.util.Scanner;

public class problem87ExceptionTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integer: ");
        int first = sc.nextInt();
        int second = sc.nextInt();

        try {
            int result = first/second;
            System.out.printf("Result is %d", result);
        } catch (ArithmeticException e) {
            if (e.getMessage().equals("/ by zero")){
                System.out.println("division by zero occurs");
            }else {
                throw e;
            }

        }finally {
            System.out.println("\nOut from method");
        }
    }
}
