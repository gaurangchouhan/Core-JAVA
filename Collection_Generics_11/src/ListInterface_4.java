import java.util.ArrayList;
import java.util.List;

public class ListInterface_4 {
    public static void main(String[] args) {
        List<Integer> strArr = new ArrayList();
        strArr.add(12);
        System.out.println();
        strArr.add(143);

        strArr.add(1, 23);
        strArr.remove(0);

        if (strArr.contains(23 )){
            System.out.println("yes");
        }

        System.out.println(strArr.indexOf(1))  ;

        System.out.println(strArr.get(0));
        System.out.println(strArr.get(1));
    }
}
