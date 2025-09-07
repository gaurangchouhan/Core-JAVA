import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution10Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        // no. of element
        for(int i = 0; i<N; i++){
            list.add(sc.nextInt());
        }

        // no. of queries
        int Q = sc.nextInt();
        for(int j = 0; j<Q; j++){
            String query = sc.next();

            if(query.equals("Insert")){
                list.add(sc.nextInt(), sc.nextInt());
            }else if(query.equals("Delete")){
                list.remove(sc.nextInt());
            }
        }

        for(int k = 0; k<list.size(); k++){
            System.out.print(list.get(k));
            if(k<list.size()-1)System.out.print(" ");
        }
    }
}
