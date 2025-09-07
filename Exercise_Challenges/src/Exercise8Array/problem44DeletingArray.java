package Exercise8Array;

// Must Watch Before Any exam

import java.util.Scanner;

public class problem44DeletingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("Which number you want to delete from array: ");
        int num = sc.nextInt();

        int[] newArr = deleteNumArr(numArr, num);
        System.out.println("Here is the new Array: ");
        ArrayUtility.displayArray(newArr);
    }

    public static int[] deleteNumArr(int[] numArr, int num){
        int occ = problem41NoOfOccurrence.occurrence(numArr, num);
        if (occ == 0) {
            return numArr;
        }

        int size = numArr.length - occ;
        int[] newArr = new int[size];

        int i = 0, j = 0;
        while (i < numArr.length){
            if (numArr[i] != num){
                 newArr[j] = numArr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
}
