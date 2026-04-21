package ThreadTypes_02.Type2;

public class printTask implements Runnable{
    long startTime = System.currentTimeMillis();
    @Override
    public void run() {
        //Print task
        for (int i = 1; i <= 1000; i++) {
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
