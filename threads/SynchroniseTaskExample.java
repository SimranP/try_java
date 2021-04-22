public class SynchroniseTaskExample {

    public static void main(String[] args) {
        SynchronisedTask task1 = new SynchronisedTask(10, 30, "Thread 1");
        task1.start();

        System.out.println(task1.getSum());
    }
}
