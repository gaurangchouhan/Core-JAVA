package Exercise10TernarySwitch;

import java.util.Scanner;

public class problem57monthName {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number = ");
    int num = sc.nextInt();

    String output = switch (num){
        case 1 -> "Jan";
        case 2 -> "Feb";
        case 3 -> "Mar";
        case 4 -> "Apr";
        case 5 -> "May";
        case 6 -> "Jun";
        case 7 -> "Jul";
        case 8 -> "Aug";
        case 9 -> "Sept";
        case 10 -> "Oct";
        case 11 -> "Nov";
        case 12 -> "Dec";

        default -> "Invalid";
        };
        System.out.println(output);
    }
}
