package ExecutorService_08;

import ThreadTypes_02.Type2.printTask;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestingSingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();

        printTask task1 = new printTask('*');

        service.submit(task1);
        service.submit(task1);
        service.shutdown();
    }
}
