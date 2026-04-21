import java.util.Scanner;

public class Solution21Sir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int negative = 0;

        for (int first = 0; first < size; first++) {
            int sum = 0;  // reset sum for each new start index
            for (int second = first; second < size; second++) {
                sum += arr[second];
                if (sum < 0) negative++;
            }
        }

        System.out.println(negative);
    }
}
