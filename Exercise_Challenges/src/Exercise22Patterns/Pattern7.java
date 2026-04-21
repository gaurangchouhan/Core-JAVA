package Exercise22Patterns;

public class Pattern7 {
    void pattern(){
        //lines
        for (int i = 0; i < 9; i++) {
            //space
            for (int j = 9; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k<=i; k++) {
                if (i%2!=0){
                    continue;
                }
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern7 p7 = new Pattern7();
        p7.pattern();
    }
}
