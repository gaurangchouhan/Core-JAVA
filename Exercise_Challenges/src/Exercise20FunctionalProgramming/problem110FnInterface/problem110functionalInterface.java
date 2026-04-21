package Exercise20FunctionalProgramming.problem110FnInterface;

import java.util.Arrays;
import java.util.List;

public class problem110functionalInterface {
    public static void main(String[] args) {
        TestInterface test = num -> {
            for (int i = 2; i < num; i++) {
                if (num%2==0){
                    return false;
                }
            }
            return true;
        };
        System.out.println(test.isCandidate(5));
    }
}
