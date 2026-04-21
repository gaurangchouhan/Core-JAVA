package instanceof_03;

// 2. instanceof returning false for null

public class Example_3 {
    public static void main(String[] args)
    {
        Example_3 tobj = null;

        // A simple case
        if (tobj instanceof Example_3)
            System.out.println("tobj is instance of Test");
        else
            System.out.println(
                    "tobj is NOT instance of Test");
    }
}
