package Exercise12controlStatementMathString;

import java.util.Scanner;

public class problem72circleAreaCircum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of circle: ");
        double radius = sc.nextDouble();

        System.out.print("Area of the circle: ");
        long area = (long) (Math.PI * (radius*radius));
        System.out.println(area);

        System.out.print("Circumference of the circle: ");
        long Circum = (long) (2 * Math.PI * radius);
        System.out.println(Circum);
    }
}
