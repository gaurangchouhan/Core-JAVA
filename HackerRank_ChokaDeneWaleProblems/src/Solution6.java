import java.util.*;
import java.text.*;


public class Solution6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat currenyFormat1 = NumberFormat.getCurrencyInstance(Locale.US);
        String us = currenyFormat1.format(payment);

        NumberFormat currenyFormat2 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = currenyFormat2.format(payment);

        NumberFormat currenyFormat3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = currenyFormat3.format(payment);

        NumberFormat currenyFormat4 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = currenyFormat4.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
