package Exercise18CollectionGenerics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class problem92Sir {
    public static void main(String[] args) {
        List<String> animal = Arrays.asList("Tiger", "Lion", "Cat", "Monkey", "Bear", "Ant");

        System.out.println(animal);
        swap(animal);
        System.out.println(animal);
    }

    public static void swap(List<String> stringList){
        Collections.swap(stringList, 0, 3 );
    }
}
