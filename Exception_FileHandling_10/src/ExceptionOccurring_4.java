import java.util.Scanner;

public class ExceptionOccurring_4 {
    public static void main(String[] args) {
        a();
    }

    private static void a(){
        b();
    }

    private static void b(){
        c();
    }

    private static void c(){
        d();
    }

    private static void d(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            int[] divide = new int[5];
            System.out.printf("Result is %d", divide [6]);
            divide[6] = a/b;
            System.out.printf("Result is %d \n", divide[6]);
        } catch (ArithmeticException e) {
            System.out.printf("%s, enter valid value", e.getMessage());
        }catch (Throwable th) {
            System.out.println("General Exception.");
            throw th;
        }finally {
            System.out.println("I am in finally...");
        }
    }
}
