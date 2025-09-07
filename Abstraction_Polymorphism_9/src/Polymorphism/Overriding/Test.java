package Polymorphism.Overriding;

public class Test {
    public static void main(String[] args) {
        Car1 c1 = new Car1();
        Plane1 p1 = new Plane1();

        c1.go();
        p1.go();
    }

    public static void testCase(Vehicle veh){
        veh.starting();
        /*
        aap vehicle ke reference se sirf wo hi method call kr skte h jo aapke pas ho
        jb reference starting method ko call krta h to object ka call hota h lekin compiler
        ko ye bhi nhi pata hota h run time me ki object Car ka pass kiya h ya Plane ka
         */
    }
}
