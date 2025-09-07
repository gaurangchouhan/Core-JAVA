package Exercise7LoopMethod;

import java.util.Scanner;

public class problem28MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write the table of ");
        int num = sc.nextInt();

        int i = 1;
        while (i<11){
            System.out.println(num + " x " + i + " = " + num*i);
            i++;
        }
    }
}
