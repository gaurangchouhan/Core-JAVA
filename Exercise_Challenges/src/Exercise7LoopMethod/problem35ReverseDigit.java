package Exercise7LoopMethod;

import java.util.Scanner;

public class problem35ReverseDigit {
    public static int ReverseDigit(int num){
        int reverse = 0;
        while (num>0){
            int newNum = num%10;
            reverse = reverse*10 + newNum ;
            num = num/10;

        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number = ");
        int N = sc.nextInt();

        int x = ReverseDigit(N);
        System.out.println("Reverse Number = " + x);
    }
}
