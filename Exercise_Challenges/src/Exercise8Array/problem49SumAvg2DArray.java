package Exercise8Array;

public class problem49SumAvg2DArray {
    public static void main(String[] args) {
        int[][] numArr = ArrayUtility.input2DArray();
        int sum = sum(numArr);
        int avg = avg(numArr);
        System.out.println("Sum of Array elements = " + sum);
        System.out.println("Average of Array elements = " + avg);
    }

    public static int sum(int[][] numArr){
        int sum = 0;
        int i = 0;
        while (i < numArr.length){
            int j = 0;
            while (j< numArr.length){
                sum += numArr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }

    public static int avg(int[][] numArr){
        int avg = sum(numArr)/ numArr.length;
        return avg;
    }
}
