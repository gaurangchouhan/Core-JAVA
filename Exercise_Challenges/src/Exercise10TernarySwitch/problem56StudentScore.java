package Exercise10TernarySwitch;

import java.util.Scanner;

public class problem56StudentScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int mark = sc.nextInt();

        String Category = mark<50 ? "Low" : (mark>50 && mark<80 ? "Moderate" : "High");
        System.out.println("Student lie in " + Category);
    }
}
