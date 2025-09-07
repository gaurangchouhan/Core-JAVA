package Exercise8Array;

/*
Sorting - array arrange in either increasing or decreasing order
*/

public class problem43SortingArray {
    public static void main(String[] args) {
        int[] dudArray = ArrayUtility.inputArray();

        boolean isIncreasing = isIncreasing(dudArray);
        boolean isDecreasing = isDecreasing(dudArray);

        if (isIncreasing || isDecreasing) {
            System.out.println("User Array is SORTED");
        }else {
            System.out.println("User Array is NOT SORTED");
        }
    }

    public static boolean isIncreasing(int[] dudArray){
         int i = 1;
         while (i< dudArray.length){
             if (dudArray[i] < dudArray[i-1]){
                 return false;
             }
             i++;
         }
        return true;
    }
    public static boolean isDecreasing(int[] dudArray){
        int i = 1;
        while (i< dudArray.length){
            if (dudArray[i] > dudArray[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
