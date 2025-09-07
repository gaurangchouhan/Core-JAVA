package Exercise7LoopMethod;

public class problem39PatternPrinting {
    public static void starPattern1(){
        int i = 0;
        while (i<5){
            System.out.print("*");
            int j = 0;
            while (j<i){
                System.out.print(" *");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
    }

    public static void starPattern2(){
        int i = 5;
        while (i>0){
            System.out.print("*");
            int j = 1;
            while (j<i){
                System.out.print(" *");
                j++;
            }
            System.out.println();
            i--;
        }
        System.out.println();
    }

    public static void starPattern3(){
        int i = 5;
        while (i>0){
            // this loop prints spaces
            int k = 0;
            while (k<i-1){
                System.out.print (" ");
                k++;
            }
            // this loop prints stars
            int j = 0;
            while (j <= (5-i) ){
                System.out.print(" *");
                j++;
            }
            System.out.println( );
            i--;
        }
    }
    public static void main(String[] args) {
        starPattern1();
        starPattern2();
        starPattern3();
    }
}
