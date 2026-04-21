package SynchronizeKeyword_06;

public class UpdateThread extends Thread{
    private final Counter counter;

    public UpdateThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.increment();
        }
    }
}
