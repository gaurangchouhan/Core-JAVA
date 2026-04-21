package Exercise20FunctionalProgramming;

import java.util.List;

public class problem107StringToSteam {
    public static void main(String[] args) {
        List<String> num = List.of("one", "two", "three", "four", "five");

        num.stream().forEach(number -> System.out.println(number));
    }
}
