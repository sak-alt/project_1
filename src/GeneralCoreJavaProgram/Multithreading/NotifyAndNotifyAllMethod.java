package GeneralCoreJavaProgram.Multithreading;

public class NotifyAndNotifyAllMethod {
    public static void main(String[] args) {
        final Object lock = new Object();

        Thread thread1 = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("Thread 1: Waiting for notification...");
                    lock.wait(); // Pauses the execution of Thread 1
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1: Resumed execution.");
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("Thread 2: Performing some task.");
                    Thread.sleep(2000); // Simulating some task
                    System.out.println("Thread 2: Task completed.");
                    // lock.notify(); // Notifying a single waiting thread
                    lock.notifyAll(); // Notifying all waiting threads
                    System.out.println("Thread 2: Sent notification(s).");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread: Program execution completed.");
    }
}
