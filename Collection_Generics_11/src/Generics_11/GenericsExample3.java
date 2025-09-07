package Generics_11;

public class GenericsExample3 {
    static <T> void print(T num){
        System.out.println(num);
    }

    public static void main(String[] args) {
        print(11);
    }
}
