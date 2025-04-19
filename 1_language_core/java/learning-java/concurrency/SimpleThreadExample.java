// Simple example of Java concurrency
class MyRunnable implements Runnable {
    private final String name;
    public MyRunnable(String name) {
        this.name = name;
    }
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(name + " is running: " + i);
        }
    }
}

public class SimpleThreadExample {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyRunnable("Thread 1"));
        Thread t2 = new Thread(new MyRunnable("Thread 2"));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Both threads finished.");
    }
}
