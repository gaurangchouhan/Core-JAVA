package Exercise22Patterns;

public class Pattern15 {
    void pattern(){
        for (int i = 4; i>=0; i--) {
            for (char ch='A'; ch<='A'+i; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern15 p15 = new Pattern15();
        p15.pattern();
    }
}
