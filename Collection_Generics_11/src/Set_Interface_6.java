import java.util.HashSet;
import java.util.Set;

public class Set_Interface_6 {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        System.out.println(names.add("Gaurang"));
        System.out.println(names.add("Chouhan"));
        System.out.println(names.add("(GC)"));

        Utility.print2(names);

        System.out.println();
        System.out.println(names.add("Gaurang"));

        System.out.println(names.size());

        System.out.println(names.contains("Chouhan"));
        System.out.println(names.remove("Gaurang"));
        Utility.print2(names);

        System.out.println(names.remove("Gaurang"));


    }
}
