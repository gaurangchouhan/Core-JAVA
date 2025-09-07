package Exercise8Array;
// Meine kiya h khud se pura wo bhi 😁
import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the element: ");
        int i = 0;
        while (i < arr.length){
            System.out.print( "arr" + "[" + i + "]" + " : ");
            arr[i] = sc.nextInt();
            i++;
        }
        return arr;
    }
    public static void displayArray(int[] numArray) {
        int i = 0;
        while (i < numArray.length) {
            System.out.print(numArray[i] + " ");
            i++;
        }
        System.out.println();
    }


        public static int[][] input2DArray(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of Array: ");
            System.out.print("no. of row = ");
            int row = sc.nextInt();
            System.out.print("no. of column = ");
            int column = sc.nextInt();

            int[][] numArr = new int[row][column];

            System.out.println("Enter the element: ");
            int i = 0;
            while (i < row){
                int j = 0;
                while (j < column ){
                    System.out.print("numArr" + "[" + i + "]" + "[" + j + "]" + "= " );
                    numArr[i][j] = sc.nextInt();
                    j++;
                }
                i++;
            }
            return numArr;
        }
    }

