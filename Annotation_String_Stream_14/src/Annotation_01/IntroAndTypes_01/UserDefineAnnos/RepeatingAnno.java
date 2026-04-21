package Annotation_01.IntroAndTypes_01.UserDefineAnnos;

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(myRepeatAnno.class)

@interface Word{
    String word() default "word";
    int value() default 0;
}

@Retention(RetentionPolicy.RUNTIME)
@interface myRepeatAnno{
    Word[] value();
}

public class RepeatingAnno {

    @Word(word = "First", value = 1)
    @Word(word = "Second", value = 2)

    public static void newMethod(){
        RepeatingAnno obj = new RepeatingAnno();
        try {
            Class<?> c = obj.getClass();

            Method m = c.getMethod("newMethod");

            Annotation anno = m.getAnnotation(myRepeatAnno.class);
            System.out.println(anno);
        }catch (NoSuchMethodException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        newMethod();
    }
}
