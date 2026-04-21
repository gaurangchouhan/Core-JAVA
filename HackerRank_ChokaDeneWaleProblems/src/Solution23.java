import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numCases = sc.nextInt();
        Set<Integer> num = new HashSet<>();

        for (int i = 0; i < numCases; i++) {
            int n = sc.nextInt();
            num.add(n);
        }

        Object[] newNum = num.toArray();

        int k=0;
        for (int i = 0; i < newNum.length; i++) {
            int x = (int) newNum[i];
            for (int j = 0; j >= i; j++) {
                int y = x*(int)newNum[j];

            }
        }


    }

    public static boolean isPrime(int N){
        int k = 0;
        for (int i = 2; i < N; i++) {
            for (int j = 1; j < N; j++) {
                if (i%j == 0){
                    if ()
                }
            }
        }
        return true;
    }
}
