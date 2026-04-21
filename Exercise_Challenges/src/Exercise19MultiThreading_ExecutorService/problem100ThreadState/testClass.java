package Exercise19MultiThreading_ExecutorService.problem100ThreadState;

public class testClass {
    public static void main(String[] args) {
        Universal u1 = new Universal("Gaurang");
        Universal u2 = new Universal("Om");
        Universal u3 = new Universal("Parth");

        Thread t1 = new Thread(u1);
        Thread t2 = new Thread(u2);
        Thread t3 = new Thread(u3);

        t1.start();
        t2.start();
        t3.start();
    }
}
