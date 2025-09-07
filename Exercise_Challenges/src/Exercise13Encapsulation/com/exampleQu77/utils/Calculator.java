package Exercise13Encapsulation.com.exampleQu77.utils;

import Exercise13Encapsulation.com.exampleQu77.geometry.Circle;
import Exercise13Encapsulation.com.exampleQu77.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle area1 = new Circle(12);
        System.out.println("Area of Circle: "
                + Math.PI * Math.pow(area1.radius, 2));


        Rectangle area2 = new Rectangle(12, 5);
        System.out.println("Area of Rectangle: " +
                (area2.length * area2.breadth));

    }
}
