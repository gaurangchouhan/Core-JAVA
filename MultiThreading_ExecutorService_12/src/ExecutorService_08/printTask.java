package ExecutorService_08;

public class printTask implements Runnable{
    long startTime = System.currentTimeMillis();
    @Override
    public void run() {
        //Print task
        for (int i = 1; i <= 100; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("%d%c ", i, targetChar);
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("\n %s %c task complete & Time Taken: %d ",
                Thread.currentThread().getName(), targetChar, (endTime-startTime));
    }


    private final char targetChar;

    public printTask(char targetChar) {
        this.targetChar = targetChar;
    }


}
