package Exercise18CollectionGenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class problem92swap {

    public static void main(String[] args) {
        List<String> animal = new ArrayList<>();
        animal.add("Lion");
        animal.add("Deer");
        animal.add("Elephant");
        animal.add("Monkey");
        animal.add("Tiger");

        System.out.println(animal);

        Collections.swap(animal, 1, 3);
        Utility.print2(animal);

    }
}
