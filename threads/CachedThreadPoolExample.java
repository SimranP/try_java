import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolExample {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 1; i <=13; i++) {
            executorService.submit(new RunnableTask(i + " thread"));
        }
        executorService.shutdown();
    }
}
