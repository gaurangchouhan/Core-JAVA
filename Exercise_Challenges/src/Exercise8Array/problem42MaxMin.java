package Exercise8Array;

public class problem42MaxMin {
    public static void main(String[] args) {
        int[] numArray = ArrayUtility.inputArray();

        int max = numArray[0];
        int min = numArray[0];
        int i = 1;
        while (i < numArray.length){
            if (numArray[i]>max){
                max = numArray[i];
            }
            if (numArray[i]<min){
                min = numArray[i];
            }
            i++;
        }
        System.out.println("Maximum element in an Array = " + max);
        System.out.println("Minimum element in an Array = " + min);
    }
}
