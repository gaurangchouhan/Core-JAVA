public class RandomNum_Math_06 {
    public static void main(String[] args) {
        System.out.println(Math.abs(-99));
        System.out.println(Math.ceil(9.1));
        System.out.println(Math.floor(9.9));
        System.out.println(Math.round(5.5));
        System.out.println(Math.random());

        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.round(Math.random()*100));
            System.out.println(random);
        }
    }
}
