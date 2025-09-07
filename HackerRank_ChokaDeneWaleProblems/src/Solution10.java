import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int L = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        // no. of element
        int N = sc.nextInt();
        for(int i = 0; i<N; i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);

        // no. of queries
        int Q = sc.nextInt();
        System.out.println("Insert");
        list.add(sc.nextInt(), sc.nextInt());

        System.out.println("Delete");
        list.remove(sc.nextInt());

        System.out.println(list);
    }
}
