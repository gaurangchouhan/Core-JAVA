package Exercise8Array;

import java.util.Scanner;

public class problem41NoOfOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] newArray = ArrayUtility.inputArray();
        System.out.print("Enter a number by user: ");
        int userNum = sc.nextInt();

        int occurrence = occurrence(newArray, userNum);
        System.out.println("Your element was found " + occurrence + " times in the array");
    }

    public static int occurrence(int[] newArray, int userNum){
        int occ = 0;
        int i = 0;
        while (i<newArray.length){
            if (userNum == newArray[i]){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
