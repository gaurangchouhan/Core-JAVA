import java.util.Arrays;
import java.util.Scanner;

public class Solution21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
            System.out.print(arr[i] + " ");
        }

        int negative = 0;
        int sum = 0;
        for(int first = 0; first<size; first++){
            for(int second = size-1; second>=first; second--){
                int[] subArr = Arrays.copyOfRange(arr, first, second);
                for(int i = 0; i<subArr.length; i++){
                    sum += subArr[i];
                }
                if(sum<0){
                    negative++;
                }
            }
        }
        System.out.println(negative);
    }
}
