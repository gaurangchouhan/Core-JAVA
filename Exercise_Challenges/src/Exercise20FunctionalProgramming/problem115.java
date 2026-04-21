package Exercise20FunctionalProgramming;

import java.util.List;

public class problem115 {
    public static void main(String[] args) {
        List<String> num = List.of("1", "2", "3", "4", "5");

        num.stream()
                .map(Integer::parseInt)
                .map(num1 -> Math.pow(num1 , 2))
                .reduce((a, b) -> a+b)
                .ifPresent(System.out::println);
    }
}
