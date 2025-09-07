import java.util.Scanner;

public class WhileLoop2 {
    public static void main(String[] args) {
        /*
        int a = 1;                   //initialization
        while (a<=10){               //condition
            System.out.println(a);   //actual work
            a++;                     //increment
        }
        */

        /*
        int b = 500;
        while (b>=200){
            System.out.println(b);
            b--;
        }
        */

        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i <= 5){
            int k = sc.nextInt();
            System.out.println("Number: " + k);
            i++;
        }
    }
}
