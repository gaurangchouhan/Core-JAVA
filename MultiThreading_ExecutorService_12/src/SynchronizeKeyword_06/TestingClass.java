package SynchronizeKeyword_06;

public class TestingClass {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();

        Counter counter = new Counter();

        UpdateThread t1 = new UpdateThread(counter);
        UpdateThread t2 = new UpdateThread(counter);


        try {
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted: " + e.getMessage() );
        }

        long endTime = System.currentTimeMillis();
        System.out.printf("Final value: %d and Time Taken: %d",
                 counter.getCount(), (endTime-startTime));
    }

}
