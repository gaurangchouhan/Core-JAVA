package Exercise5AssignmentOperator;

import java.util.Scanner;

public class swapWithoutExtraVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swaping: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
