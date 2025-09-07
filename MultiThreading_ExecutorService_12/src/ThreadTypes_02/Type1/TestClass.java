package ThreadTypes_02.Type1;

public class TestClass {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
//        System.out.println("Starting Time: "+startTime);

       FirstTask t1 = new FirstTask();
       SecondTask t2 = new SecondTask();
       ThirdTask t3 = new ThirdTask();

       t1.start();
       t2.start();
       t3.start();

        long endTime = System.currentTimeMillis();
//        System.out.println(endTime);

        System.out.printf("Time taken: %d", (endTime-startTime));
    }
}
