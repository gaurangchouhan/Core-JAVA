import java.util.*;

public class Collection_Class_7 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        arr.add(12);
        arr.add(45);
        arr.add(3);
        arr.add(-76);
        arr.add(-23);
        Utility.print1(arr);

        Collections.sort(arr);
        Utility.print1(arr);

        Collections.reverse(arr);
        Utility.print1(arr);

        Collections.replaceAll(arr, 12, 32);
        Utility.print1(arr);

        Collections.addAll(arr, 55,-12, 44);
        Utility.print1(arr);

        List<Integer> unmodified = Collections.unmodifiableList(arr);
        unmodified.add(87); // ❌ Error

    }
}
