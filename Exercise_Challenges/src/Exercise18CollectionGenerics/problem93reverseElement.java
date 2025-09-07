package Exercise18CollectionGenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class problem93reverseElement {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();

        number.add(56);
        number.add(78);
        number.add(23);
        number.add(54);
        number.add(12);

//        System.out.println(number);

        Collections.reverse(number);
        Utility.print1(number);
    }
}
