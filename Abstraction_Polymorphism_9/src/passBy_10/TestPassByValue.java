package passBy_10;

public class TestPassByValue {
    public static void main(String[] args) {
        int x = 12, y = 8;
        int sum = add(x, y);
        System.out.printf("x=%d, y=%d, sum=%d", x, y, sum);
    }

    public static int add(int a, int b){
        a += b;
        return a;
//        return a+b;
        /*
        a aur b x aur y ki copy h agr kuch bhi change a ya b me kre to wo x aur y ko affect nhi krenge
         */
    }
}
