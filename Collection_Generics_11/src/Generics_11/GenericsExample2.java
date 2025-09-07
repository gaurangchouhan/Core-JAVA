package Generics_11;

public class GenericsExample2<T, U> {
    T obj1;
    U obj2;

    public GenericsExample2(T obj1, U obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    public T getObj1(){
        return obj1;
    }

    public U getObj2(){
        return obj2;
    }

    public static void main(String[] args) {
        GenericsExample2<String, Integer> example2 = new GenericsExample2<>("apple", 12);

        System.out.println(example2.getObj1());
        System.out.println(example2.getObj2());
    }
}
