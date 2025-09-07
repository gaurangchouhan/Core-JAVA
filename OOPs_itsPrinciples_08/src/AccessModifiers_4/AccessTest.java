package AccessModifiers_4;

public class AccessTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "Red";
        car.model = "Swift";
        car.fuelLevel = 4; // ❌ Error -> fuel private property h

         Car newCar = new Car("Black", "Audi",
                 1, 200000);

        System.out.println(car);
        System.out.println(newCar );
    }
}
