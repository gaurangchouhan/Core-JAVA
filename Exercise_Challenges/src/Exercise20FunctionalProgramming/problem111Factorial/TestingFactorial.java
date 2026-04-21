package Exercise20FunctionalProgramming.problem111Factorial;

import Exercise20FunctionalProgramming.problem110FnInterface.TestInterface;

import java.util.stream.IntStream;

public class TestingFactorial {
    public static void main(String[] args) {
       int fact = 5;
//        System.out.println(factorial(fact));

       IntStream.rangeClosed(2, fact)
                .reduce((a, b) -> a*b)
               .ifPresent(System.out::println);
    }

    public static long factorial(int num){
        long numb = 1;
        for (int i = 1; i < num; i++) {
            long fact = i*numb;
            numb = fact;
        }
        return numb;
    }
}
