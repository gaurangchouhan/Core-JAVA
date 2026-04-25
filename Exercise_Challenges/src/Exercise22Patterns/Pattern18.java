package Exercise22Patterns;

public class Pattern18 {
    void pattern(){
        for (int i = 0; i < 5; i++) {
            for (char ch = (char) ('E'-i); ch<='E'; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern18 p18 = new Pattern18();
        p18.pattern();
    }
}
