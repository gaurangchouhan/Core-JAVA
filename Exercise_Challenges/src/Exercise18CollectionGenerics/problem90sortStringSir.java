package Exercise18CollectionGenerics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class problem90sortStringSir {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Tiger", "Lion", "Cat", "Monkey", "Bear", "Ant");
        System.out.println(stringList);

        sortInDescending(stringList);
        System.out.println(stringList);
    }

    public static void sortInDescending(List<String> StringList){
        Collections.sort(StringList);  // Method 1

        Collections.sort(StringList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.equals(o2)){
                    return 0;
                } else if (o1.charAt(0) < o2.charAt(0)) {
                    return -1;
                }else {
                    return 0;
                }
            }
        });
    }
}
