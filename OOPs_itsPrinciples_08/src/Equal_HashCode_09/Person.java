package Equal_HashCode_09;

public class Person  {
    private String name;
    private int age;
    private String id;

    // Default Constructor
    Person(String name, int age, String id){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    // Equals


    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)){
            return false;
        }
        Person per = (Person) obj;
        return per.name.equals(name) &&
                per.id.equals(id) &&
                per.age == age;
    }

    // Getter & Setter
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
