import java.util.Collection;

public class Utility {
    public static void print1(Collection c){
        System.out.print("Collection is: ");
        for (Object o : c) {
            System.out.printf("%d ", o);
        }
        System.out.println();
    }

    public static void print2(Collection c){
        System.out.print("Collection is: ");
        for (Object obj : c) {
            System.out.printf("%s ", obj);
        }

    }
}
