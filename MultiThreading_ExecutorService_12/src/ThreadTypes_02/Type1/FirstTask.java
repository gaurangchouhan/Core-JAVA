package ThreadTypes_02.Type1;

public class FirstTask extends Thread{
    @Override
    public void run() {

        // First Task
        System.out.println("Start First Task");
        for (int i = 1; i <= 1000; i++) {
        System.out.printf("%d@ ", i);
        }
        System.out.printf("\n %s @ task complete",
                Thread.currentThread().getName());
    }
}
