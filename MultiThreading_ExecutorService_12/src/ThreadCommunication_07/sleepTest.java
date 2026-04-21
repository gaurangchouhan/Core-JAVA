package ThreadCommunication_07;

public class sleepTest extends Thread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Before Sleeping");
        sleepTest.sleep(5000);
        System.out.println("Woke Up ");
    }
}
