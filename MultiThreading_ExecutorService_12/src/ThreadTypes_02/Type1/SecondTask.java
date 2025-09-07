package ThreadTypes_02.Type1;

public class SecondTask extends Thread{
    @Override
    public void run() {

        // Second Task
        System.out.println("Start Second Task");
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d$ ", i);
        }
        System.out.printf("\n %s $ task complete",
                Thread.currentThread().getName());
    }
}
