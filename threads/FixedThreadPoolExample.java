import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExample {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(8);

        for (int i = 1; i <=6; i++) {
            executorService.submit(new RunnableTask(i + " thread"));
        }
        executorService.shutdown();
    }
}
