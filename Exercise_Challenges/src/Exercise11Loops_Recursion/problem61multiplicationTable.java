package Exercise11Loops_Recursion;

import java.util.Scanner;

public class problem61multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write the table of ");
        int num = sc.nextInt();

        for (int i = 1; i<=10; i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
}
