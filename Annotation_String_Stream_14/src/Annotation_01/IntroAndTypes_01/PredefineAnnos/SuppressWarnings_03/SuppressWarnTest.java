package Annotation_01.IntroAndTypes_01.PredefineAnnos.SuppressWarnings_03;

public class SuppressWarnTest {

    @Deprecated
    public void method(){
        System.out.println("Suppress");
    }

    @SuppressWarnings("deprecated")
    public static void main(String[] args) {
        SuppressWarnTest obj = new SuppressWarnTest();
        obj.method();
    }
}
