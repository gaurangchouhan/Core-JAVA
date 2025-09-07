import java.util.Scanner;

public class Recursion_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("User! Enter your number: ");
        int num = sc.nextInt();

        long Factorial = Recursion(num);
        System.out.println("Factorial of your number is " + Factorial);
    }

    public static long Recursion(int num){
        if (num == 1 || num == 0){
            return 1;
        }
        return num * Recursion(num-1);
    }

    public static long Factorial1(int num){
        long result = 1;
        for (int i = 1; i<=num; i++){
            result *= i;
        }
        return result;
    }
}
