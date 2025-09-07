package Exercise11Loops_Recursion;

import java.util.Scanner;

public class problem63maxEleArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] myArr = new int[size];

        for (int i = 0; i < myArr.length; i++) {
            System.out.print("myArr" + "[" + i + "]" + " = ");
            int num = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int number : myArr) {
            if (max<number) {
                max = number;
            }
        }
        System.out.println("Maximum element in array: " + max);
    }
}
