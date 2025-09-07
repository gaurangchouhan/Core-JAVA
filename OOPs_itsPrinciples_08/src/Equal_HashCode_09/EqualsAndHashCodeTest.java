package Equal_HashCode_09;

public class EqualsAndHashCodeTest {
    public static void main(String[] args) {
        Person person1 = new Person("Gaurang", 19, "068");
        Person person2 = new Person("Gaurang", 19, "068");

        if (person2.equals(person1)){
            System.out.println("Equals");
        }else {
            System.out.println("Not Equals");
        }
    }
}
