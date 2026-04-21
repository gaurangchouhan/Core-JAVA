package Exercise20FunctionalProgramming;

import java.util.List;

public class problem109filterOddNum {
    public static void main(String[] args) {
        List<Integer> num = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        num.stream()
                .filter(number -> number%2!=0)
                .forEach(number -> System.out.println(number ));
    }
}
