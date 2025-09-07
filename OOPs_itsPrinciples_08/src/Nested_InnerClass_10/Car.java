package Nested_InnerClass_10;

public class Car {
    public int noOfDoors;

    public void repair() {
        Tire t = new Tire();
    }

    protected class Tire{
        private double width;
        private String material;
        private double pressure;

        public void inflated(){
            noOfDoors = 4;
        }
    }
}
