package AccessModifiers_4;

public class Car {

    public String color;
    public String model;
    double fuelLevel;
    long cost0fPurchase;

    // Default Constructor
    public Car(){

    }

    Car(String color, String model, double fuelLevel, long cost0fPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.cost0fPurchase = cost0fPurchase;
    }

    @Override
    public String  toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("color='").append(color).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", fuelLevel=").append(fuelLevel);
        sb.append(", cost0fPurchase=").append(cost0fPurchase);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        Car car = new Car("Red", "Swift", 1, 25000);
        System.out.println(car);
    }
}
