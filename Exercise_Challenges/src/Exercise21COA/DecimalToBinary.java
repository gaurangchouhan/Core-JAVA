package Exercise21COA;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        Decimal(num);
    }

    public static void Decimal(int n){
        Vector<Integer> remainder = new Vector<>();
        while (n>0){
            int rem = n%2;
            remainder.add(rem);
            n=n/2;
        }
        Collections.reverse(remainder);
        for (int i = 0; i < remainder.size(); i++) {
            System.out.print(remainder.get(i));
        }
    }
}
