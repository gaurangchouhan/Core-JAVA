package instanceof_03;

// 1. Here we will be creating sample classes with a parent-child relationship.

class Parent {}

    class child extends Parent{}

    public class Example_2{
    public static void main(String[] args) {

        // Creating object of child class
        child c1 = new child();

        // A simple case
        if (c1 instanceof child){
            System.out.println("c is instance of Child");
        }else {
            System.out.println("c1 is NOT instance of Child");
        }

        // instanceof returning true for Parent class also
        if (c1 instanceof Parent){
            System.out.println("c1 is instance of Parent");
        }else {
            System.out.println("c1 is NOT instance of Parent");
        }
// instanceof returns true for all ancestors

        // Note : Object is ancestor of all classes in Java

        if (c1 instanceof Object) {
            System.out.println(
                    "c1 is instance of Object");
        }else {
            System.out.println(
                    "c1 is NOT instance of Object");
        }
    }
}
