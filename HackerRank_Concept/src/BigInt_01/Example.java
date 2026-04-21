package BigInt_01;

import java.math.BigInteger;
import java.util.Scanner;

public class Example {
    public static BigInteger factorial(int N){
        BigInteger num = new BigInteger("1");
        for (int i = 2; i <= N; i++) {
            num = num.multiply(BigInteger.valueOf(i));
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        System.out.println(factorial(N));

    }
}
