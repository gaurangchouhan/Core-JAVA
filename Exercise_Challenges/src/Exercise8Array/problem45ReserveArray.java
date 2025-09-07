package Exercise8Array;

public class problem45ReserveArray {
    public static void main(String[] args) {
        int[] numArr = ArrayUtility.inputArray();
        System.out.println("Here is the Reverse Array: ");
        int[] ReverseArr = ReverseArr(numArr);
        ArrayUtility.displayArray(ReverseArr);
    }

    public static int[] ReverseArr(int[] numArr){
        int[] newArr = new int[numArr.length];
        int i = 0, j = numArr.length-1 ;
        while (i<numArr.length){
            if (j>=0){
                newArr[j] = numArr[i];
                j--;
            }
            i++;
        }
        return newArr;
    }
}
