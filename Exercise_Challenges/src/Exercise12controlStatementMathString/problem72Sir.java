package Exercise12controlStatementMathString;

import java.util.Scanner;

public class problem72Sir {

    double radius;

    problem72Sir(double radius){
        this.radius = radius;
    }

    double getCircumference(){
        return 2 * radius * Math.PI;
    }

    double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle Props: Radius in mm: " + radius
                + " , Circumference in mm: " + getCircumference ()
                + ", Area in mm2: " + getArea () ;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System. in);
        System.out.println("Welcome to the world of Circle\n");
        System.out.print("Please enter your radius: ");
        double radius = input.nextDouble();
        problem72Sir circle = new problem72Sir(radius);
        System.out.println(circle);
    }
}
