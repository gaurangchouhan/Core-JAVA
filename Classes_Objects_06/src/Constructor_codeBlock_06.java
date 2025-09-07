public class Constructor_codeBlock_06 {
    static int carSold;     // Static Variable

    String color;
    int fuelInCar;
    int price;
    String name;
    int maxSpeed;
    int noOfSeat;

    static {                // Static Block run at once only
        carSold = 0;
        System.out.println("It is an STATIC BLOCK ");
    }
    {
//      Consider A Default construction jo saare construction ke pehle call hoga
        carSold++;
        System.out.println("It is an INITIALIZATION BLOCK ");
    }
    Constructor_codeBlock_06(){    // Default construction
        this("black");
        fuelInCar = 2;
        price = 100000;
        name = "Swift";
        maxSpeed = 150;
        noOfSeat = 5;
    }

    Constructor_codeBlock_06(String color){    // parameterised construction
        this.color = color;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("I am Iron MAN🫰🏻");
    }

    public static void main(String[] args) {
        Constructor_codeBlock_06 myCar1 = new Constructor_codeBlock_06("Red");
        Constructor_codeBlock_06 myCar2 = new Constructor_codeBlock_06();
        System.out.println(myCar1.maxSpeed);
//        myCar.color = "White";
        System.out.println(myCar1.color);
        System.out.println(myCar1.price += 10000);
    }
}
