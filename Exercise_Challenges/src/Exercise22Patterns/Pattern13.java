package Exercise22Patterns;

public class Pattern13 {
    void pattern1(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 1+(n*(n-1)/2); j <= (n*(n-1))/2; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern13 p13 = new Pattern13();
        p13.pattern1(4);
    }
}
