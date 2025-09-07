package Exercise8Array;

import java.util.Scanner;

public class problem40SumAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the element: ");
        int sum = 0;
        int i = 0;
        while (i < arr.length){
            System.out.print( "arr" + i + " : ");
            arr[i] = sc.nextInt();
            sum += arr[i];
            i++;
        }
        System.out.println("Sum of Array of element: " + sum);
        int Average = sum/ arr.length;
        System.out.println("Average of Array of element: " + Average);
    }
}
