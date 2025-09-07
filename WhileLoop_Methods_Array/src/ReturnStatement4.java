import java.util.Scanner;

public class ReturnStatement4   {
    public static void main(String[] args) {
        int a = sum();
        int b = sum();

        int sumNum = a+b;
        System.out.println(sumNum);
    }
    public static int sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("number = ");
        int number = sc.nextInt();

        return number;
    }
}
