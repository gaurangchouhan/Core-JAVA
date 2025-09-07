package Exercise7LoopMethod;

import java.util.Scanner;

public class problem37ArmstrongNum {
    public static boolean isArmstrong(int N){
        int noOfDigit = noOfDigit(N);
        int copyOfN = N;
        int finalNumber = 0;
        while (N>0){
            int lastDigit = N%10;
            N /= 10;
            finalNumber += power(lastDigit, noOfDigit);
        }
        System.out.println("Final No. is : " + finalNumber);    //for debugging 
        return finalNumber == copyOfN;
    }

    public static int power(int num1, int num2){
        int result = 1;
        int i = 0;
        while (i<num2){
            result *= num1;
            i++;
        }
        System.out.println("Power of " + num1 + " is " + result);    //for debugging
         return result;
    }

    public static int noOfDigit(int num){
        int digit = 0;
        while (num>0){
            digit++;
            num /= 10;
        }
        System.out.println("No. of Digit is: " + digit);    //for debugging
        return digit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int num = sc.nextInt();

        boolean isArmstrong = isArmstrong(num);
        if (isArmstrong){
            System.out.println("Your number is Armstrong Number");
        }else {
            System.out.println("Your number is not  Armstrong Number");
        }
    }
}
