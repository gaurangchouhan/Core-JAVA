package Exercise18CollectionGenerics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class problem93Sir {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2, 4, 65, 76, 23, 21);

        System.out.println(number);
        reverseArr(number);
        System.out.println(number);
    }

    public static void reverseArr(List<Integer> number){
//        Collections.reverse(number);

        for (int i = 0; i < number.size() / 2; i++) {
            Collections.swap(number, i, number.size() - 1- i);
        }
    }
}
