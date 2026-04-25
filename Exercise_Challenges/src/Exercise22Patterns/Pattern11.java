package Exercise22Patterns;

public class Pattern11 {
    void pattern1(){
        int j=0, k=1;
        for (int i = 1; i < 6 ; i++) {
            if (i%2 != 0){
                for (int l = 1; l <= i; l++) {
                    if (l%2 != 0){
                        System.out.print(k + " ");
                    }else {
                        System.out.print(j + " ");
                    }
                }
                System.out.println();
            }else {
                for (int l = 1; l <= i; l++) {
                    if (l%2 != 0){
                        System.out.print(j + " ");
                    }else {
                        System.out.print(k + " ");
                    }
                }
                System.out.println();
            }
        }
    }

    void pattern2(){
        int start=1;
        for (int i = 0; i < 5; i++) {
            if(i%2==0){
                start=1;
            }else {
                start = 0;
            }
            for (int j = 0; j <= i ; j++) {
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern11 p11 = new Pattern11();
        p11.pattern1();
    }
}
