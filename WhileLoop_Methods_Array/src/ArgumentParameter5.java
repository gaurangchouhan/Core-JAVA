public class ArgumentParameter5 {
    public static int sum(int num1, int num2){    // PARAMETER
        num1 = num1 + 10;
        num2 = num2 + 10;
        System.out.println("Value of num1 & num2 after calling the method:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        return num1+num2;


    }
    public static void main(String[] args) {
        int a = 10, b = 15;
        System.out.println("Original value of num1 & num2:");
        System.out.println("num1 = " + a);
        System.out.println("num2 = " + b);
        System.out.println("sum =  " + sum(a, b));  // ARGUMENT
    }
}
