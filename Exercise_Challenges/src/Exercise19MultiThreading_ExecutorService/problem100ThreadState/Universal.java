package Exercise19MultiThreading_ExecutorService.problem100ThreadState;

public class Universal implements Runnable{
    @Override
    public void run() {
        System.out.printf("%s\n", name);

        System.out.printf("State of %s: %s\n",
                Thread.currentThread().getName(),
                Thread.currentThread().getState());
    }

    private final String name;

    public Universal(String name) {
        this.name = name;
    }
}
