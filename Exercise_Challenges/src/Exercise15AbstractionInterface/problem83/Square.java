package Exercise15AbstractionInterface.problem83;

public class Square extends Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of Square: " + (side*side));
    }
}
