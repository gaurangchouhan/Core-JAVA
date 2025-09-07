package Inheritance_06;

public class twoWheeler extends Vehicle {
   twoWheeler(){
       noOfTires = 2;
   }
  public void balancing(){
      System.out.printf("I am balancing on %d tires \n", noOfTires);
  }
}
