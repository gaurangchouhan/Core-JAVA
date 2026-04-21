package instanceof_03;

// Java program to demonstrate that non-method
// members are accessed according to reference
// type (Unlike methods which are accessed according
// to the referred object)

class cParent {
    int value = 1000;
}

class pChild extends cParent {
    int value = 10;
}

// Driver class
public class Example_6 {
    public static void main(String[] args)
    {
        cParent cobj = new pChild();
        cParent par = cobj;

        // Using instanceof to make sure that par
        // is a valid reference before typecasting
        if (par instanceof pChild) {
            System.out.println(
                    "Value accessed through "
                            + "parent reference with typecasting is "
                            + ((pChild)par).value);
        }
    }
}
