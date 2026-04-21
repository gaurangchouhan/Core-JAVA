package Exercise22Patterns;

public class Pattern5 {
    void pattern(){
        for (int i = 0; i < 6; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern5 p5 = new Pattern5();
        p5.pattern();
    }
}
