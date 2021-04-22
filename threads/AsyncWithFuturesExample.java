import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AsyncWithFuturesExample {

    // Future.get is blocking and therefore it will print the result in order we have written get statements

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Integer> result1 = executorService.submit(new SumNumbersCallableTask(3, 4, 1000));
        Future<Integer> result2 = executorService.submit(new SumNumbersCallableTask(5, 8, 3000));
        Future<Integer> result3 = executorService.submit(new SumNumbersCallableTask(2, 8, 2000));

        executorService.shutdown();

        System.out.println(result1.get());
        System.out.println(result2.get());
        System.out.println(result3.get());
    }
}
