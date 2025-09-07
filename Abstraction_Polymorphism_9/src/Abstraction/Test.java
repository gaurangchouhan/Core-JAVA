package Abstraction;

public class Test {
    public static void main(String[] args) {
//        Vehicle veh = new Vehicle() ;   cannot access due to abstract class
        Car car = new Car();
        car.commute();
    }
}
