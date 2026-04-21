package Exercise20FunctionalProgramming;

import java.util.function.BinaryOperator;

public class problem106Sir {
    public static void main(String[] args) {
        BinaryOperator< Integer> multi = (a, b) -> a * b;
        int result = multi.apply(4, 54);
        System.out.println(result    );
    }
}
