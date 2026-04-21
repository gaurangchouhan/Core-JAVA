package ExecutorService_08.futures10;

import java.util.concurrent.Callable;

public class FetchName implements Callable<String> {
     private final String name;

    public FetchName(String name) {
        this.name = name;
    }

    public String call() throws InterruptedException {
        System.out.printf("\n Getting full name of %s from server", name);
        Thread.sleep(4000);
        return name + " Indian";
    }
}
