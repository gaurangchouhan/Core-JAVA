public class ifElse06 {
    public static void main(String[] args) {
        boolean isMale = true;
        String name = "bob";

        System.out.println("before if");
        if (isMale){
            System.out.println("Mr. " + name);
        }else {
            System.out.println("Ms. " + name);
        }

        boolean isSeniorCitizen = false;
        boolean anAdult = false;

        if (isSeniorCitizen){
            System.out.println("Hello Senior Citizen");
        }else {
            if (anAdult){
                System.out.println("Hello Adult");
            }else {
                System.out.println("Hello Child");
            }
        }
    }
}
