package Polymorphism.Overloading_6;

public class MethodConstructor_Overloading {

    MethodConstructor_Overloading(){
        System.out.println("Hey, whatsapp!!");
    }

    MethodConstructor_Overloading(String pop){
        System.out.println(pop);
    }

    public int add(int a, int b){
        return a+b;
    }

    public String add(String a, String b){
        return a.concat(b);
    }

    public int add(int a, int b, int c, int d){
        return 0;
    }

    public static void main(String[] args) {
        MethodConstructor_Overloading mO = new MethodConstructor_Overloading( );
        mO.add(1, 2, 4, 5);
        String I = mO.add("a", "b");
        mO.add(4, 8);

        System.out.println(I);
    }
}
