package Exercise7LoopMethod;

import java.util.Scanner;

public class problem30Factorial {
    public static void factorial(int N){
        int a= 1, total;
        int i = 1;
        while (i<=N){
            total = a*i;
            a = total;
            i++;
        }
        System.out.println("Factorial of " + N + " = " + a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int a = sc.nextInt();
        factorial(a);
    }
}
