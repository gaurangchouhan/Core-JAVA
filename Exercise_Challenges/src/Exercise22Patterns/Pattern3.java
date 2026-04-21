package Exercise22Patterns;

public class Pattern3 {
    void pattern(){
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern3 p3 = new Pattern3();
        p3.pattern();
    }
}
