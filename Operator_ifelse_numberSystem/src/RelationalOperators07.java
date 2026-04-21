import java.util.Scanner;

public class RelationalOperators07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = input.nextInt();

        if (age>=18){
            System.out.println("Eligible for vote");
        } else {
            System.out.println("Not Eligible for vote");
        }
    }
}
