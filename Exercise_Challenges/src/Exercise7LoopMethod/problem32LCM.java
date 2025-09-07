package Exercise7LoopMethod;

import java.util.Scanner;

/*
Find LCM of 4 and 6
Multiples of 4: 4, 8, 12, 16, 20, ...
Multiples of 6: 6, 12, 18, 24, ...
The smallest common multiple is 12.
*/

public class problem32LCM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        int lcm = LCM(a, b);
        System.out.println(lcm);
    }
        public static int LCM(int a, int b){

        int i = 1;
        while (i<=b){
            int factor = a*i;
            if (factor % b == 0){
                return factor;
            }
            i++;
        }
        return i;    // yaha tk loop jayega hi nhi
    }
}
