import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsyncWithCompletionExample {

    // Completion service is not blocking and therefore it will print the result in order of task completion

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        CompletionService<Integer> completionService = new ExecutorCompletionService<>(executorService);
        completionService.submit(new SumNumbersCallableTask(3, 4, 1000));
        completionService.submit(new SumNumbersCallableTask(5, 8, 3000));
        completionService.submit(new SumNumbersCallableTask(2, 8, 2000));

        executorService.shutdown();

        for (int i = 0; i < 4; i++) {
            System.out.println(completionService.take().get());
        }
    }
}
