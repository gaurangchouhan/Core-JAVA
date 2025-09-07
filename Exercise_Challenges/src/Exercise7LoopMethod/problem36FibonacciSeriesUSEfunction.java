package Exercise7LoopMethod;

import java.util.Scanner;

public class problem36FibonacciSeriesUSEfunction {
    public static void fiboSeries(int N){
        if (N < 0) return;
        System.out.print("0 ");
        if (N == 0) return;
        System.out.print("1 ");

        int  first = 0, second = 1;
        while (first+second<=N){
                int next = first+second ;
                System.out.print(next + "  ");
                next = first + second;
                first = second;
                second = next;

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int num = sc.nextInt();
        System.out.println ("Here is the Fibonacci Series");
        fiboSeries(num);

    }
}
