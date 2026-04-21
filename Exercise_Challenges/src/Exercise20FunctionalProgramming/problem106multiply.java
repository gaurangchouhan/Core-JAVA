package Exercise20FunctionalProgramming;

import java.util.List;
import java.util.Scanner;

public class problem106multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        List<Integer> num = List.of(a, b);
        int multiply = num.stream()
                .reduce(0, (x, y) -> (a*b));

        System.out.println("Multiplication = " + multiply );
    }
}
