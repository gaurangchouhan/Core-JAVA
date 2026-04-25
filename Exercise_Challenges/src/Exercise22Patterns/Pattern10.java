package Exercise22Patterns;

public class Pattern10 {
    void pattern1(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pattern2(int n){
        for (int i = 1; i < 2*n-1; i++) {
            int star = i;
            if(i>n){
                star = 2*n - i;
            }
            for (int j = 1; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern10 p10 = new Pattern10();
//        p10.pattern1();
        p10.pattern2(5);
    }
}
