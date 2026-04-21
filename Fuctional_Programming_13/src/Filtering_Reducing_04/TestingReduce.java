package Filtering_Reducing_04;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingReduce {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,3,4,5,6,7);

        int sum = 0;
        for (Integer number : numbers) {
            sum+=number;
        }
            System.out.println(sum);

        int newSum = numbers.stream()
                .reduce(0, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer integer1, Integer integer2) {
                        return integer1 + integer2;
                    }
                });
        System.out.printf("\n sum using reduce is %d", newSum) ;

        int newSum2 = numbers.stream()
                .reduce(0, (a, b) -> a+b);
        System.out.printf("\n sum using reduce & Lambda is %d", newSum) ;

        int max = numbers.stream()
                .reduce(Integer.MIN_VALUE, (a, b) -> a>b ? a : b);
        System.out.printf("\n m  ax using reduce & Lambda is %d", max) ;

    }
}
