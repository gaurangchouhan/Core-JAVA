package Exercise8Array;

import java.util.Scanner;

public class problem48SearchElement2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] numArr = ArrayUtility.input2DArray();
        System.out.print("User enter the number: ");
        int userNum = sc.nextInt();
        boolean isExist = isExist(numArr, userNum);

        if (isExist){
            System.out.println("Yes, User entered number exist");
        }else {
            System.out.println("No, User entered number does not exist");
        }
    }

    public static boolean isExist(int[][] numArr, int num){
        int i = 0;
        while (i<numArr.length){
            int j = 0;
            while (j<numArr.length){
                if (numArr[i][j] == num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
