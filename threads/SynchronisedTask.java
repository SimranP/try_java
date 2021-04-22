public class SynchronisedTask implements Runnable {
    private int x;
    private int y;
    private int sum = 0;
    private String threadName;
    private volatile boolean done;

    public SynchronisedTask(int x, int y, String threadName) {
        this.x = x;
        this.y = y;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sum = x + y;
        done = true;
        synchronized (this) {
            this.notify();
        }
    }

    public int getSum() {
        synchronized (this) {
            if (!done) {
                System.out.println("Waiting for task to be done...");
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        return sum;
    }

    public void start() {
        Thread thread = new Thread(this);
        System.out.println("Starting thread " + threadName);
        thread.start();
    }
}
