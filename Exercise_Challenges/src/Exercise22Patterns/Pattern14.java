package Exercise22Patterns;

public class Pattern14 {
    void pattern(){
        for (int i = 0; i < 5; i++) {
            for (char ch = 'A'; ch<='A'+i; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern14 p14 = new Pattern14();
        p14.pattern();
    }
}
