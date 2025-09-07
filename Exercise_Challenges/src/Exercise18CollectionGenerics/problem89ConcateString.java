package Exercise18CollectionGenerics;

public class problem89ConcateString {
    static void strArr(String ...element){
        for (String str : element){
            System.out.printf("%s ", str);
        }
    }

    public static void main(String[] args) {
        strArr("apple", "watermelon", "mango");
        System.out.println();
        System.out.println("apple ".concat("juice"));
        System.out.println("watermelon ".concat("red"));
        System.out.println("mango      ".concat("king"));
    }
}
