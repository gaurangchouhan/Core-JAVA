package Exercise19MultiThreading_ExecutorService.problem101joinMethod;

public class Universal implements Runnable {

    @Override
    public void run() {
        System.out.printf("%s %c task start\n",
                Thread.currentThread().getName(), targetChar);

        for (int i = 0; i < 100; i++) {
            System.out.printf("%d%c", i, targetChar);
        }
        System.out.printf("\n %s %c task complete\n",
                Thread.currentThread().getName(), targetChar);
    }

    private final char targetChar;

    public Universal(char targetChar) {
        this.targetChar = targetChar;
    }
}
