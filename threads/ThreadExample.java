public class ThreadExample {

    public static void main(String[] args) {
        RunnableTask runnableTask1 = new RunnableTask("Simran");
        RunnableTask runnableTask2 = new RunnableTask("Abhishek");
        RunnableTask runnableTask3 = new RunnableTask("Ishu");

        runnableTask1.start();
        runnableTask2.start();
        runnableTask3.start();
    }
}
