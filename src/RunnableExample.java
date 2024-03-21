
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
    }
}
public class RunnableExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();
        Thread t2 = new Thread(new MyRunnable());
        t2.start();
    }
}