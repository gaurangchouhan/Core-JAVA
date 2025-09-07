package Exercise8Array;

public class problem50SumDiaElement {
    public static void main(String[] args) {
        int[][] numArr = ArrayUtility.input2DArray();
        long sum = sum(numArr);
        System.out.println("Sum of Element of 2D Array: " + sum);
    }

    public static long sum(int[][] numArr){
        long leftSum = leftSumDiaElement(numArr);
        long rightSum = rightSumDiaElement(numArr);
        long sum = leftSum + rightSum;
        if (numArr.length % 2 != 0){
            int index = numArr.length/2;
            sum -= numArr[index][index];
        }
        return sum;
    }

    public static long leftSumDiaElement(int[][] numArr){
        long SumDiagonalElement = 0;
        int i = 0;
        while (i < numArr.length){
            int j = 0;
            while (j < numArr.length){
                if (i == j){
                    SumDiagonalElement += numArr[i][j];
                }
                j++;
            }
            i++;
        }
        return SumDiagonalElement;
    }

    public static long rightSumDiaElement(int[][] numArr){
        long SumDiagonalElement = 0;
        int i = 0;
        while (i<numArr.length){
            int j = 0;
            while (j < numArr.length){
                if (i + j == numArr.length - 1){
                    SumDiagonalElement += numArr[i][j];
                }
                j++;
            }
            i++;
        }
        return SumDiagonalElement;
    }
}
