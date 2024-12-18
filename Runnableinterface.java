class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable Thread is running!");
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
