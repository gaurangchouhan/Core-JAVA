import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution9Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // number of lines
        List<List<Integer>> lines = new ArrayList<>();

        // Read n lines
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt(); // number of integers in this line
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                row.add(sc.nextInt());
            }
            lines.add(row); // add row to main list
        }

        int q = sc.nextInt(); // number of queries

        // Answer queries
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt(); // line number   1
            int y = sc.nextInt(); // position in that line   3
            if (x <= lines.size() && y <= lines.get(x - 1).size()) {    // 0
                System.out.println(lines.get(x - 1).get(y - 1));    // 0 2
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}
