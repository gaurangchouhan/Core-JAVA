package Exercise15AbstractionInterface.problem83;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of Circle: " + (Math.PI * Math.pow(radius, 2)));
    }
}
