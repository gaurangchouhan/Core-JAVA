package Exercise16OverloadOverride.problem86;

public class TestClass {
    public static void main(String[] args) {
        Vehicle veh = new Vehicle();
        Car car = new Car();
        veh.service();
        car.service();
    }
}
