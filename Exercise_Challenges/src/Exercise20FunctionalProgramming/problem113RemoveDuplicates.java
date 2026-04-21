package Exercise20FunctionalProgramming;

import java.util.List;
import java.util.stream.Collectors;

public class problem113RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> num = List.of(1, 2, 2, 4, 5, 6, 4, 8, 9, 10);

        List<Integer> distinctItem = num.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distinctItem);
    }
}
