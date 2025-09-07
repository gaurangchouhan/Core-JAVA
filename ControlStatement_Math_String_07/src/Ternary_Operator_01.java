import java.util.Scanner;

public class Ternary_Operator_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("num1 = ");
        int num1 = sc.nextInt();
        System.out.print("num2 = ");
        int num2 = sc.nextInt();

        int greaterNumber =  num1>num2 ? num1:num2;
        System.out.println(greaterNumber + "  is the greater number");
    }
}
