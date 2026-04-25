package Exercise22Patterns;

public class Pattern9 {
    void pattern(){
        for (int i = 0; i < 5; i++) {
            //space
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 4; i >= 0 ; i--) {
            //space
            for (int j = 5-i-1; j > 0; j--) {
                System.out.print(" ");
            }
            //star
            for (int j = 2*i+1; j > 0 ; j--) {
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
        Pattern9 p9 = new Pattern9();
        p9.pattern();
    }
}
