package Exercise11Loops_Recursion;

import java.util.Scanner;

public class problem59passwordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password;
        do {
            System.out.println("Please enter your password: ");
            password = sc.next();
        }while (!isValid(password));
        System.out.println("Thanks for entering a valid password");
    }

    public static boolean isValid(String  password){
        return password.length()>7 ;
    }
}
