package Inheritance_06;

public class InheritanceTest {
    public static void main(String[] args) {
        Vehicle veh = new Vehicle();
        veh.commute();

        System.out.println();

        twoWheeler two = new twoWheeler();
        two.commute();
        two.balancing();

        System.out.println();

        MotorCycle moc = new MotorCycle();
        moc.commute();
        moc.balancing();
        moc.start();
    }
}
