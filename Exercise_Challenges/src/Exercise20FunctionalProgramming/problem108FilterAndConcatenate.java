package Exercise20FunctionalProgramming;

import java.util.List;

public class problem108FilterAndConcatenate {
    public static void main(String[] args) {
        List<String> error = List.of("wewefef", "dwadfewrwe3ffs", "fdtfdydaa", "dgygdeywaggur", "gdgdy", "bcdgzfufg");

        String name = error.stream()
                .filter(errors -> errors.length()>=10 )
                .reduce("", (a, b) -> a + " " + b);
        System.out.println(name);
    }
}
