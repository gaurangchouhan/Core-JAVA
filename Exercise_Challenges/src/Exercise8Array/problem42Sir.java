package Exercise8Array;

public class problem42Sir {
    public static void main(String[] args) {
        int[] newArr = ArrayUtility.inputArray();
        int max = max(newArr);
        int min = min(newArr);

        System.out.println("Maximum element in an Array: " + max);
        System.out.println("Minimum element in an Array: " + min);

    }
    public static int max(int[] newArr){
        if (newArr.length == 0){
            return Integer.MAX_VALUE;
        }

        int max = newArr[0];
        int i = 1;
        while (i<newArr.length){
            if (newArr[i]>max){
                max = newArr[i];
            }
            i++;
        }
        return max;
    }
    public static int min(int[] newArr){
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i<newArr.length){
            if (newArr[i]<min){
                min = newArr[i];
            }
            i++;
        }
        return min;
    }
}
