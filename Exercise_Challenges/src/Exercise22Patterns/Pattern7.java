package Exercise22Patterns;

public class Pattern7 {
    void pattern(){
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
                for (int k = 1; k >= i; k++) {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern7 p7 = new Pattern7();
        p7.pattern();
    }
}
