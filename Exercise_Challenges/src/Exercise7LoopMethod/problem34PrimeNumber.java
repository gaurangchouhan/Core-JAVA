package Exercise7LoopMethod;

import java.util.Scanner;

public class problem34PrimeNumber {
    public static boolean PRIME(int x){
        int i = 2;
        while (i < x){
            if (x%i==0){
                return false;
            } 
            i++;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. = ");
        int num = sc.nextInt();

        boolean isPrime = PRIME(num);
        if (isPrime ){
            System.out.println("Yes, number is prime");
        }else {
            System.out.println("No, number is not prime");
        }
    }
}
