package Exercise19MultiThreading_ExecutorService.problem103singleThreadExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class singleThread {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        printNum task = new printNum();

        service.submit(task);
        service.shutdown();
    }
}
