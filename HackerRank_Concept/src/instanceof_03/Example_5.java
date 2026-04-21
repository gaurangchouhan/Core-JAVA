package instanceof_03;

//4. Parent reference referring to a Child is an instance of a Child

class pParent {
}
class cChild extends pParent {
}

// Driver class
public class Example_5 {
    // main function
    public static void main(String[] args)
    {
        // Reference is Parent type but object is
        // of child type.
        pParent cobj = new cChild();
        if (cobj instanceof cChild)
            System.out.println("cobj is instance of Child");
        else
            System.out.println(
                    "cobj is NOT instance of Child");
    }
}
