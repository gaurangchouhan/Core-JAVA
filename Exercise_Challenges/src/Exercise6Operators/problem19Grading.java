package Exercise6Operators;

import java.util.Scanner;

public class problem19Grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        if (a>90 && a<100){
            System.out.println("A");
        } else if (a<90 && a>75) {
            System.out.println("B");
        } else if (a<75 && a>60) {
            System.out.println("C");
        } else if (a<60 && a>30) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
    }
}
