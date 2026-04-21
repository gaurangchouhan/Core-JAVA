package Annotation_01.IntroAndTypes_01.UserDefineAnnos;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_USE)
// TYPE_USE => we can use this target type annotation in class, method, enum, attributes

@interface typeAnno{}

@typeAnno
public class TypesAnno {
    public static void main(String[] args) {
        TypesAnno tA = new TypesAnno();
        @typeAnno
        String str = "I am annotated with a type annotation";
        System.out.println(str);
        tA.abc();

        // abc(); => it is a method to call static method that's why I make class's object
        //           & then call abc() method.
    }

    @typeAnno
    public int abc(){ // non-static method
        System.out.println("This function's  return type is annotated");
        return 0;
    }


}
