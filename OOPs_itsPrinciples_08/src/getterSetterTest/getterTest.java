package getterSetterTest;

import getterSetter_05.Car;

public class getterTest {
    public static void main(String[] args) {
        Car car = new Car("white", "maruti",
                12, 250000);
        car.setColor("blue");
        System.out.printf("%s, %s", car.getColor(), car.getModel());
    }
}
