package Exercise18CollectionGenerics;

import java.lang.reflect.Array;
import java.util.*;

public class problem91ElementFrequency {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 4, 6, 56, 76);

        System.out.println(number);
        freq(number);
        System.out.println(number);

    }

    public static void freq(List<Integer> str){
        System.out.println(Collections.frequency(str, 2));
    }
}
