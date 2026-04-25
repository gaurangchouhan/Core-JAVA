package Exercise22Patterns;

public class Pattern16 {
    void pattern(){

        for (int i = 0; i < 5; i++) {
            char c = (char) ('A'+i);
            for (int j = 0; j <=  i; j++) {
                System.out.print(c+"");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern16 p16 = new Pattern16();
        p16.pattern();
    }
}
