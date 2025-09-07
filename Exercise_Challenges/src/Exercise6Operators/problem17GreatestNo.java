package Exercise6Operators;

import java.util.Scanner;

public class problem17GreatestNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter c: ");
        int c = sc.nextInt();

        if (a>c){
            if (a<b){
                System.out.println("a is the greatest");
            }else {
                if (b>c){
                    System.out.println("b is the greatest");
                }
            }
        }else {
            System.out.println("c is the greatest");
        }
    }
}
