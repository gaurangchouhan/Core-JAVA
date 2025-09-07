package Exercise8Array;

public class problem47MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = ArrayUtility.inputArray();
        int[] arr2 = ArrayUtility.inputArray();

        int[] merge = merge(arr1, arr2);
        System.out.println("Here is the sorted array:");
        ArrayUtility.displayArray(merge);
    }
    public static int[] merge(int[] arr1, int[] arr2){
        int newSize = arr1.length + arr2.length;
        int[] newArr = new int[newSize];

        int i = 0, j = 0, k = 0;
        while (i < arr1.length || j < arr2.length ){
            if (j == arr2.length ||
                    (i< arr1.length && arr1[i]<arr2[j])){
                newArr[k] = arr1[i];
                k++;
                i++;
            }else {
                newArr[k] = arr2[j];
                k++;
                j++;
            }
        }
        return newArr;
    }
}
