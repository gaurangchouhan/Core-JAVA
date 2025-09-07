package Exercise11Loops_Recursion;

import java.util.Scanner;

public class problem68fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int num = sc.nextInt();
        System.out.println ("Here is the Fibonacci Series");
        for (int i = 1; i <= num; i++) {
            System.out.print(fiboSeries (i) + " ");
        }
    }

    public static int fiboSeries(int num){
        if (num == 1 ){
            return 0;
        }
        if (num == 2){
            return 1;
        }
        return fiboSeries(num-1) + fiboSeries(num-2);
    }
}
