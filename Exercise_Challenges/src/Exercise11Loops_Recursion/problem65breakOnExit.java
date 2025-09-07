package Exercise11Loops_Recursion;

import java.util.Scanner;

public class problem65breakOnExit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "";
        while (true){
            System.out.print("Enter here: ");
            str = sc.next();
            if (str.equals("exit")){
                break;
            }
        }
    }
}
