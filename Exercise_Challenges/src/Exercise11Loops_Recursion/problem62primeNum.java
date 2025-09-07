package Exercise11Loops_Recursion;

import java.util.Scanner;

public class problem62primeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("User! Enter your number: ");
        int num = sc.nextInt();

        boolean isPrime = isPrime(num);

        if (isPrime){
            System.out.println("Your number is PRIME");
        }else {
            System.out.println("Your number is NOT PRIME");
        }
    }

    public static boolean isPrime(int num){
        for (int i = 2; i<num; i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}
