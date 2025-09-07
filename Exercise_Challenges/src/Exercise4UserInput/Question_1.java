package Exercise4UserInput;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("name: ");
        String name = input.nextLine();
        System.out.println("Welcome " + name + " to KG Coding");
    }
}
