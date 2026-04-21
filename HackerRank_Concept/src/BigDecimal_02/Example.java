package BigDecimal_02;

import java.math.BigDecimal;

public class Example {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("1234.1213");
        BigDecimal b = new BigDecimal("32123.1233");

        BigDecimal c = b.add(a);
        System.out.println(c);
    }
}
