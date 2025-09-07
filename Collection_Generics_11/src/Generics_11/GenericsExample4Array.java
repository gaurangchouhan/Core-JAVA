package Generics_11;

public class GenericsExample4Array {

    public static <T> void printArray(T[] element){
        for (T t : element) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        Integer[] intEx = {1, 2, 3};
        String[] strEx = {"Hello", "World"};

        printArray(intEx);
        printArray(strEx);
    }
}
