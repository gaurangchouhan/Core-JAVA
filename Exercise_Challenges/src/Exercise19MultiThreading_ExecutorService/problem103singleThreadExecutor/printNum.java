package Exercise19MultiThreading_ExecutorService.problem103singleThreadExecutor;

public class printNum implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }
}
