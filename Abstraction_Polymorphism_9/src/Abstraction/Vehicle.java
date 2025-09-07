package Abstraction;

public abstract class Vehicle implements Transport{        // Abstract keyword
    private int noOfTyre;

    public abstract void startVehicle();   // Abstract method

    @Override
    public void getSetGo() {
        System.out.println("A to B");
    }

    public Vehicle(int noOfTyre) {
        this.noOfTyre = noOfTyre;
    }

    public int getNoOfTyre() {
        return noOfTyre;
    }

    public void setNoOfTyre(int noOfTyre) {
        this.noOfTyre = noOfTyre;
    }

    public void commute(){
        System.out.println("going......");
    }
}
