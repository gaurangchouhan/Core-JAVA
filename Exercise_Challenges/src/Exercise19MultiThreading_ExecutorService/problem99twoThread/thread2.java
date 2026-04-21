package Exercise19MultiThreading_ExecutorService.problem99twoThread;

public class thread2 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println(i + " Hello from Thread 2");
        }
    }
}
