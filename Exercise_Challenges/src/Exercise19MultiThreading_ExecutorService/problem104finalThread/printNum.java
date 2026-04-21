package Exercise19MultiThreading_ExecutorService.problem104finalThread;

public class printNum implements Runnable{
    @Override
    public void run() {
        System.out.printf("Thread %c name: %s\n", character,
                Thread.currentThread().getName());
        try {
            Thread.sleep(1000, 5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    private final char character;

    public printNum(char character) {
        this.character = character;
    }
}
