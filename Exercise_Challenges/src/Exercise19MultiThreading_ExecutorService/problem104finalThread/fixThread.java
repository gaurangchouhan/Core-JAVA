package Exercise19MultiThreading_ExecutorService.problem104finalThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class fixThread {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(1);

        printNum task1 = new printNum('@');
        printNum task2 = new printNum('#');
        printNum task3 = new printNum('$');
        printNum task4 = new printNum('%');

        service.submit(task1);
        service.submit(task2);
        service.submit(task3);
        service.submit(task4);

        if (service.awaitTermination(10, TimeUnit.SECONDS)) {
            System.out.println( "EMERGENCY SHUTDOWN");
            service.shutdownNow() ;
        }
    }
}
