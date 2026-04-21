package Exercise22Patterns;

public class Pattern4 {
    void pattern(){
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern4 p4 = new Pattern4();
        p4.pattern();
    }
}
