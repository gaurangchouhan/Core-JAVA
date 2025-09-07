package Exercise7LoopMethod;

import java.util.Scanner;

public class problem36FibonacciSeriesWithoutfunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int fiboNum = sc.nextInt();

        int next = 1, first = 0, second = 1;
        int i = 0;
        while (i <= fiboNum) {
            if (i <= 1) {
                next = i;
            } else {
                next = first + second;
                first = second;
                second = next;
            }
            System.out.print(next + " ");
            i++;
        }
    }
}
