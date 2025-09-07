import java.util.Scanner;

public class throw_throws_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            int[] divide = new int[5];
            System.out.printf("Result is %d", divide [6]);
            divide[6] = a/b;
            System.out.printf("Result is %d", divide[6]);
        } catch (ArithmeticException e) {
            System.out.printf("%s, enter valid value", e.getMessage());
        }catch (Throwable th) {
            System.out.println("General Exception.");
            throw th;
        }

    }
}
