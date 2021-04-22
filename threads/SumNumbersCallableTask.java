import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class SumNumbersCallableTask implements Callable<Integer> {

    private int num1;
    private int num2;
    private int sleeptime;

    public SumNumbersCallableTask(int num1, int num2, int sleeptime) {
        this.num1 = num1;
        this.num2 = num2;
        this.sleeptime = sleeptime;
    }

    @Override
    public Integer call() throws Exception {
        String threadName = Thread.currentThread().getName();
        System.out.println("Running thread : " + threadName);
        TimeUnit.MILLISECONDS.sleep(sleeptime);
        return num1 + num2;
    }
}
