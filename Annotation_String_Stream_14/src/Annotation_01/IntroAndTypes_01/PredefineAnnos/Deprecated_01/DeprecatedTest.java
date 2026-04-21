package Annotation_01.IntroAndTypes_01.PredefineAnnos.Deprecated_01;

public class DeprecatedTest {
    @Deprecated
    public void oldMethod(){
        System.out.println("Old Method");
    }

    /**
     * @deprecated
     * Use newMethod instead
     */

    public void newMethod(){
        System.out.println("New Method");
    }

    public static void main(String[] args) {
        DeprecatedTest test = new DeprecatedTest();
        test.newMethod();
        test.oldMethod();   // ⚠ Warning: oldMethod() is deprecated
    }
}
