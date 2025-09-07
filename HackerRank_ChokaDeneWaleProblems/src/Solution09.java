import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arrayList = new ArrayList<>();
        System.out.print("Size: ");
        int totalLine = sc.nextInt();
        for (int j = 1; j <= totalLine; j++) {
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
}

