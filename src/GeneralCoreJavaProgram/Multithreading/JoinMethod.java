package GeneralCoreJavaProgram.Multithreading;

public class JoinMethod {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1: Starting execution.");
            try {
                Thread.sleep(2000); // Simulating some task
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1: Execution completed.");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2: Starting execution.");
            try {
                Thread.sleep(3000); // Simulating some task
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2: Execution completed.");
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join(); // Wait for thread1 to complete
            thread2.join(); // Wait for thread2 to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread: Program execution completed.");
    }
}
