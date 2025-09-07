package Exercise11Loops_Recursion;

import java.util.Scanner;

public class problem66AddPositiveNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many number you want to add : ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i<=num; i++){
            System.out.print("User! Enter " + i + " number: ");
            int newNum = sc.nextInt();
            if (newNum<0){
                continue;
            }
            sum += newNum;
        }
        System.out.println("sum of positive number = " + sum);
    }
}
