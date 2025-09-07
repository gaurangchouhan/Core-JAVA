package Exercise7LoopMethod;

import java.util.Scanner;

/*
Find GCD of 12 and 18
Factors of 12: 1, 2, 3, 4, 6, 12
Factors of 18: 1, 2, 3, 6, 9, 18
The largest common factor is 6
*/

public class problem33GCD {
    public static int GCD(int a, int b){
        int x = 0;
        int i = 1;
        while (i <= b){
            if (a%i == 0 && b%i == 0){
                x = i;
            }
            i++;
        }
        return x ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        int gcd = GCD(a, b);
        System.out.println("GCD = " + gcd);
    }
}
