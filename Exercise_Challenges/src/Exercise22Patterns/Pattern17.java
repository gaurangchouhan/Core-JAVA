package Exercise22Patterns;

public class Pattern17 {
    void pattern(){
        for (int i = 0; i < 5; i++) {
            //space
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            //character
            char ch='A';
            int breakpoint = (2*i+1)/2;
            for (int j = 1; j <= 2*i+1  ; j++) {
                System.out.print(ch);
                if (j<=breakpoint){
                    ch++;
                }else {
                    ch--;
                }
            }
            //space
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern17 p17 = new Pattern17();
        p17.pattern();
    }
}
