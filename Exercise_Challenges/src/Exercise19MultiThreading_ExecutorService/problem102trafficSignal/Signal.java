package Exercise19MultiThreading_ExecutorService.problem102trafficSignal;

public class Signal implements Runnable{

    @Override
    public synchronized void run() {
            System.out.printf("%s\n", Color);
    }
    private final String Color;

    public Signal(String color) {
        Color = color;
    }
}
