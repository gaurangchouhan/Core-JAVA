package Exercise8Array;

public class problem40Sir {
    public static void main(String[] args) {
        int[] numArray = ArrayUtility.inputArray();
        long sum = sum(numArray);
        int avg = Avg(numArray);

        System.out.println("Sum of Array elements: " + sum);
        System.out.println("Average of Array elements: " + avg);

    }
    public static long sum(int[] numArray){
        long sum = 0;
        int i = 0;
        while (i<numArray.length){
            sum += numArray[i];
            i++;
        }
        return sum;
    }
    public static int Avg(int[] numArray){
        long sum = sum(numArray);
        return (int)(sum/ numArray.length);
    }
}
