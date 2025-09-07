package Exercise6Operators;

import java.util.Scanner;

public class problem20Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age<13 && age>0){
            System.out.println("Child");
        } else if (age>13 && age<20) {
            System.out.println("Teen");
        } else if (age>20 && age<60) {
            System.out.println("Adult");
        }else {
            System.out.println("Senior");
        }
    }
}
