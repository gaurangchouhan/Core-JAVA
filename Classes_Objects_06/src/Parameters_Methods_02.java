class Car {

    // Properties or Attributes

    String carColor;
    int noOfWheel;
    float currentFuel;
    float maxSpeed;
    int noOfSeats;

    // Methods

    public Car start(){
        /*
        start method h wo car ko hi return krenga
        ab car apne aap ko hi kaise return kre kyuki car ka object to kisi aur ne bnaya h
         */
        if (currentFuel == 0){
            System.out.println("You can't start the car");
        } else if (currentFuel < 5 ) {
            System.out.println("You can drive but refuel first");
        }else {
            System.out.println("Car is started... bruhhhh.. ");
        }
        return this;
        /*
        aur car internally khud ko access krna chahti h to use krenge THIS
        */
    }

    public void drive(){
            System.out.println("Car is driving ");
            currentFuel--;

    }

    public void addFuel(float fuel){
        currentFuel += fuel;
    }

    public void addFuels(float currentFuel){
        this.currentFuel += currentFuel;
        /*
            jb kbhi bhi local variable aur instance variable ka name same ho
           to this. lga ke instance variable ko represent kiya jata h
        */
    }

    public float  getCurrentFuelLevel(){
        return currentFuel;
    }



    public static void main(String[] args) {
        Car prop = new Car();

        prop.addFuel(6);
        prop.drive();
        prop.drive();
        prop.drive();
        prop.addFuel(3);
        prop.drive();
        System.out.println(prop.getCurrentFuelLevel());

        Car myCar = new Car();
        myCar.addFuel(6);
        /*
            Parameters_Methods_02 startedCar = myCar.start();
            startedCar.drive();
        */
        myCar.start().drive();

        // Use & advantage of this
    }
}
