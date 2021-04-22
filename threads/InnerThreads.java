public class InnerThreads implements Runnable {

    private String threadName;

    public InnerThreads(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println("Running thread " + threadName);
        RunnableTask r1 = new RunnableTask("Thread 1");
        r1.start();
        System.out.println("Exiting thread " + threadName);
    }

    public void start() {
        Thread thread = new Thread(this, threadName);
        thread.start();
    }
}
