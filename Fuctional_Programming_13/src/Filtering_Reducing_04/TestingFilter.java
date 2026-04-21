package Filtering_Reducing_04;

import java.util.List;
import java.util.function.Consumer;

public class TestingFilter {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Mango", "Watermelon", "date");
        System.out.println(fruits.size());
        System.out.println("Printing Fruits normally");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("Printing Fruits using stream");
        fruits.stream().forEach(new Consumer<String>() {  // functional interface jisme ek hi method ya function unimplemented ho
            @Override
            public void accept(String fruit) {
                System.out.println(fruit);
            }
        });

        System.out.println("Lambda implementation");
        fruits.stream().forEach(fruit -> System.out.println(fruit)); // functional interface jisme ek hi method ya function unimplemented ho

        System.out.println("Print using filter");
        fruits.stream()
                .filter(fruit -> fruit.endsWith("e"))
                .forEach(fruit -> System.out.println(fruit));

        // filter ek stream return krta h
        // forEach ek terminal operator h jo terminate krta h
        // forEach Consumer interface leta h
        // filter predicate interface leta h
    }
}
