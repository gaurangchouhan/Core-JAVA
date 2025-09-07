import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution9 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        List<Integer> arrayList = new ArrayList<>();
        System.out.print("Size: ");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            int element = sc.nextInt();
            System.out.println("next");
            arrayList.add(element);
        }
        System.out.println(arrayList);

            System.out.print("Object: ");
            int o = sc.nextInt();
            int index = arrayList.indexOf(o);
            System.out.println(index);
            if (arrayList.contains(o)) {
                System.out.println(arrayList.get(index));
            } else {
                System.out.println("ERROR!");
            }
    }
}
