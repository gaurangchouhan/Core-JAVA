package Generics_11;

public class GenericsExample1<T>{
    T obj;

    public GenericsExample1(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public static void main(String[] args) {
        GenericsExample1<Integer> GDG = new GenericsExample1<>(23);
        System.out.println(GDG.getObj());
    }
}
