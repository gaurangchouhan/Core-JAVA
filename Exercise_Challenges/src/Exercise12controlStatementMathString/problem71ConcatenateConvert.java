package Exercise12controlStatementMathString;

public class problem71ConcatenateConvert {
    public static void main(String[] args) {

        //Concatenate
        String a = "My name is ";
        String name = "Gaurang";
        String c = a + name;
        String fullName = a.concat("").concat(name);
        System.out.println(c);
        System.out.println(fullName );

        // Convert into uppercase
        String upperCase = name.toUpperCase();
        System.out.println(upperCase);
    }
}
