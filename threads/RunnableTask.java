class RunnableTask implements Runnable {
    private Thread t;
    private final String threadName;

    RunnableTask(String name) {
        threadName = name;
    }

    public void run() {
        System.out.println("Running " +  threadName );
        try {
            for(int i = 1; i < 4; i++) {
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start () {
        System.out.println("Starting " +  threadName );
        if (t == null) {
            t = new Thread(this, threadName);
            t.start ();
        }
    }
}
