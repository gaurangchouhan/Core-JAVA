package Exercise16OverloadOverride.problem86;

public class Car extends Vehicle {
    @Override
    public void service() {
        super.service();
        System.out.println("Car require servicing...  ");
    }
}
