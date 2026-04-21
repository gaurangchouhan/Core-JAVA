package Exercise22Patterns;

public class Pattern6 {
    void pattern(){
        for (int i = 5; i >= 1 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern6 p6 = new Pattern6();
        p6.pattern();
    }
}
