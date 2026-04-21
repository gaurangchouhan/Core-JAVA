package Annotation_01.IntroAndTypes_01.PredefineAnnos.Override_02;

public class OverrideTest {
    public void display(){
        System.out.println("Parent");
    }

    public static void main(String[] args) {
        OverrideTest obj = new child();
        obj.display();
    }
}

class child extends OverrideTest{
    @Override
    public void display() {
        System.out.println("Child");
    }
}
