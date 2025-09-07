package Polymorphism;

public class TestTransport {
    public static void main(String[] args) {
        Car c = new Car();
//        Vehicle v = new Vehicle();   interface ka object nhi bnta
        Plane p = new Plane();

//        caseTest(v);
        caseTest(c);
        caseTest(p);

        // Car1 is the part of Vehicle isliye ERROR nhi aaye
        Vehicle vCar = new Car();

//        Car1 cVehicle = new Vehicle();  ❌ Error (Hr ek property car ki wo vehicle ke pas nhi ho skti)
//        Car1 cVehicle = (Car1) new Vehicle();  //   ✅ Casting
    }

    private static void caseTest(Vehicle veh){
        // caseTest ko sirf object chahiye fir wo vehicle ya car hi kyu na ho
//        Car1 cVehicle = (Car1) veh;  // Casting
        veh.start();

        // reference ek h meine uss reference pr method bhi ek hi call kiya h lekin
//         lekin 2 alg alg output aa rhe h (Polymorphism)
    }
}
