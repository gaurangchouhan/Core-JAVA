public class Function3 {
    public static void greetUser1(){
        int i = 0;
        while (i<5){
            System.out.print("*");
            int j = 0;
            while (j<i){
                System.out.print(" *");
                j++;
            }
            System.out.println( );
            i++;
        }
        System.out.println();
    }

    public static void greetUser2(){
        int k = 5;
        while (k>0){
            System.out.print("*");
            int l = 1;
            while (l<k){
                System.out.print(" *");
                l++;
            }
            System.out.println();
            k--;
        }
    }

    public static void greetUser3(){
        System.out.println("        *");
        System.out.println("      * *");
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.println("* * * * *");

        int a = 0;
        while (a<5){
            System.out.print("        *");
            int b = 0;
            while (b<a){
                System.out.print("*");
                b++;
            }
            System.out.println();
            a++;
        }
    }
    public static void main(String[] args) {
//        System.out.println("In a method: ");
//        greetUser();     //call the greetUser method
//        System.out.println("Method has called ");
        greetUser1();
        greetUser2();
        greetUser3();
    }
}
