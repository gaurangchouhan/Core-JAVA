package Functional_Interface_02;

@FunctionalInterface
// we cannot use it for a METHOD, FIELD, Local Variable, Constructor
interface demo{
    void hey();
}

class Animal{
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void eatAndHunt(){

    }
}

class Tiger extends Animal{
    public void eat(){
        System.out.println("Hunt & eat");
    }
    @Override   // only for Methods
    public void eatAndHunt(){
        System.out.println("Tiger");
    }
}

class Functional_Interface {
    public static void main(String[] args) {
        demo d = () -> {
            System.out.println("Lambda");
        };
    }
}
