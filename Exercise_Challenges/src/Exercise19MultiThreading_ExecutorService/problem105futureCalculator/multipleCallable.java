package Exercise19MultiThreading_ExecutorService.problem105futureCalculator;

import java.util.concurrent.Callable;

public class multipleCallable implements Callable<Integer> {
    private final int num;

    public multipleCallable(int num) {
        this.num = num;
    }

    @Override
    public Integer call() throws Exception {
        int fact = 1, multi;
        for (int i = 1; i <= num; i++) {
            multi = i*fact;
            fact = multi;
        }
        return fact;
    }
}
