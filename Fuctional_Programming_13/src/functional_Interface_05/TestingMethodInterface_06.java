package functional_Interface_05;

import java.util.List;

public class TestingMethodInterface_06 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,3,4,5,6,7);

        numbers.stream()
                .filter(num -> num%2==1)
                .forEach(System.out::println);
/*
         agr aapko pata h ek hi argument leta h aur jo method pas ho rha h wo bhi
         ek hi argument leta h to apn naya lambda bnane ke bajaye kya kr skte h
         jo print method pehle se bna h issi ka reference pas kr skte mtlb
         method ko as variable pass kr skte h

         System.out -> ek object h jisme println type ka method h
*/

          numbers.stream()
                .filter(num -> num%2==1)
                .forEach(num -> System.out.println(num));

          int newSum2 = numbers.stream()
                  .reduce(0, (a, b) -> a+b);
          System.out.printf("\n sum using reduce is %d", newSum2) ;

        int newSum1 = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.printf("\n sum using reduce is %d", newSum1) ;

        // Integer class ke andr ek sum method bana hua h

    }
}
