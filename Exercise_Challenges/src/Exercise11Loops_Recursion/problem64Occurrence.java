package Exercise11Loops_Recursion;

import java.util.Scanner;

public class problem64Occurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = ArrayUtility.inputArray();
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int occ = 0;
        for (int number : arr){
            if(number == num){
                occ++;
            }
        }
        System.out.println("User enter " + num + " which found " + occ + " times in Array");
    }
}
