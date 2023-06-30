package GeneralCoreJavaProgram.Multithreading;

public class WaitMethod {
    public static void main(String[] args) {
        final Object lock = new Object(); // Object used for synchronization

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println("Thread 1: Acquired lock and waiting...");
                    try {
                        lock.wait(); // Pauses the execution of Thread 1
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread 1: Resumed execution.");
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println("Thread 2: Acquired lock and performing some task.");
                    try {
                        Thread.sleep(2000); // Simulating some task
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    lock.notify(); // Notifying Thread 1 to resume execution
                    System.out.println("Thread 2: Task completed and sent notification.");
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
