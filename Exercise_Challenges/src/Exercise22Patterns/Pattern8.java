package Exercise22Patterns;

public class Pattern8 {
    void pattern(){
        for (int i = 4; i >= 0; i--) {
            //space
            for (int j = 5-i-1; j >= 0; j--) {
                System.out.print(" ");
            }
            //star
            for (int j = 2 * i + 1; j > 0; j--) {
                System.out.print("*");
            }
            //space
            for (int j = 5-i-1; j >= 0; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern8 p8 = new Pattern8();
        p8.pattern();
    }
}
