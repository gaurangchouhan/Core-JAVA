import java.util.Scanner;

public class LogicalOperator08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter age: ");
        int aging = input.nextInt();
        System.out.print("are you female: ");
        boolean gender = input.nextBoolean();

        if (aging<5){
            System.out.println("Get discount of 75%");
        } else if (gender) {
            System.out.println("Get discount of 50%");
        } else if (aging>60 && !gender ) {
            System.out.println("Get discount of 25%");
        }else{
            System.out.println("u are male");
        }
    }
}
