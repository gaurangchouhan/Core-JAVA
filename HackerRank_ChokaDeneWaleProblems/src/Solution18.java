import java.math.BigInteger;
import java.util.Scanner;

class Solution18 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        BigInteger A = new BigInteger(a);
        String b = sc.nextLine();
        BigInteger B = new BigInteger(b);

        BigInteger C = A.add(B);
        System.out.println(C);

        BigInteger D = A.multiply(B);
        System.out.println(D);
    }
}