package Exercise19MultiThreading_ExecutorService.problem105futureCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class testClass {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        try {
            ExecutorService service = Executors.newFixedThreadPool(2);


            List<Future<Integer>> List = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                multipleCallable task = new multipleCallable(i);
                List.add(service.submit(task));
            }

            for (Future<Integer> future : List) {
                System.out.printf("\n Result is: %d", future.get());
            }
        }   catch (InterruptedException | ExecutionException e){
          throw new RuntimeException (e);
        }


    }
}

