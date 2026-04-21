package Exercise19MultiThreading_ExecutorService.problem102trafficSignal;

public class showColor {
    public static void main(String[] args) throws InterruptedException{
        Signal s1 = new Signal("RED🚦");
        Signal s2 = new Signal("YELLOW🚦");
        Signal s3 = new Signal("GREEN🚦");

        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);
        Thread t3 = new Thread(s3);

        t1.start();
        Thread.sleep(5000);
        t2.start();
        Thread.sleep(5000);
        t3.start();
    }
}
