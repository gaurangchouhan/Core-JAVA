package Exercise19MultiThreading_ExecutorService.problem104finalThread;

public class printNumSir implements Runnable {
    @Override
    public void run() {
        System.out.printf("Thread  name: %s\n",
                Thread.currentThread().getName());
        try {
            Thread.sleep(random() * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private int random(){
        double time = Math.random()*5+1;
        return (int)time;
    }
}
