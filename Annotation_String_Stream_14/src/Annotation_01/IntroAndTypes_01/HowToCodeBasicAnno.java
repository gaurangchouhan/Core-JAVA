package Annotation_01.IntroAndTypes_01;

import java.lang.annotation.*;


@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
// TYPE apply for enum, interface, class
// FIELD apply for instance variable
// METHOD apply for methods.
@Retention(RetentionPolicy.RUNTIME)

// Declaring a simple type annotation
@interface cricketPlayer{
    int age() default 35;
    String country() default "India";
}

// or

// @cricketPlayer(age = 35, country = "India ")

@cricketPlayer  // TYPE
class Virat{

    @cricketPlayer  // FIELD
    int run;
    int innings;

    @cricketPlayer // METHOD
    public void setRun(int run){
        this.run = run;
    }
    public void setInnings(int innings){
        this.innings = innings;
    }

    public int getRun(){
        return run;
    }

    public int getInnings(){
        return innings;
    }
}

class cricket {
    public static void main(String[] args) {
        Virat one8 = new Virat();

        one8.setRun(15000);
        one8.setInnings(250);

        System.out.println(one8.getRun());
        System.out.println(one8.getInnings()) ;

        System.out.println();

        System.out.println("Annotation_01 values fetched below:");
        Class c = one8.getClass();
        Annotation an = c.getAnnotation(cricketPlayer.class);  // an (general type of annotation)
//        System.out.println(an);

        cricketPlayer cp = (cricketPlayer)an;     // cp object convert/casting into annotation obj an
        System.out.println("Age: " + cp.age());
        System.out.println("Country: " + cp.country());

    }
}
