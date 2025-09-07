package Exercise7LoopMethod;

import java.util.Scanner;

public class problem31ComputeSumNum {
    public static int computeSum(int N){
        int sum = 0;
        while (N > 0){
            sum += N%10;
            N = N/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int i = sc.nextInt();
        int k = computeSum(i);
        System.out.println("Number after computing is " + k);
    }
}
