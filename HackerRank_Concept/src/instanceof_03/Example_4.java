package instanceof_03;

//3. Parent object is not an instance of Child

class Parents{}

class Child extends Parents{}
public class Example_4 {
    public static void main(String[] args) {
        Parents obj = new Parents();

        if (obj instanceof Child){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
