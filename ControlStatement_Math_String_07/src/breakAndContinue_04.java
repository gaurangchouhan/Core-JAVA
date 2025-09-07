public class breakAndContinue_04 {
    public static void main(String[] args) {

        /*
        System.out.println("Break Statement");
        System.out.println("before loop");
        for (int i = 1; i<1000; i++){
            if (i==101){
                break;
            }
            System.out.println(i);
        }
        System.out.println("Out of loop");
        */

        System.out.println("Continue Statement");
        System.out.println("before loop");
        for (int i = 1; i<10; i++){
            if (i==5){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Out of loop");
    }
}
