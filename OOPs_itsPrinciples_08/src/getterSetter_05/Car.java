package getterSetter_05;

public class Car {
    private String color;  // public
    private String model;  // public
    private double fuelLevel;
    private long cost0fPurchase;   // default

    public Car(String color, String model, double fuelLevel, long cost0fPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.cost0fPurchase = cost0fPurchase;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getModel(){
        return model;
    }
}
