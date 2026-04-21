package Exercise19MultiThreading_ExecutorService.problem101joinMethod;

public class runningClass {
    public static void main(String[] args) throws InterruptedException {
        Universal u1 = new Universal('@');
        Universal u2 = new Universal('*');
        Universal u3 = new Universal('$');

        Thread t1 = new Thread(u1);
        Thread t2 = new Thread(u2);
        Thread t3 = new Thread(u3);

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();
    }
}
