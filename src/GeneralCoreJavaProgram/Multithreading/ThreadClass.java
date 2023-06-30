package GeneralCoreJavaProgram.Multithreading;

public class ThreadClass extends Thread {

    private int threadNumber;

    public ThreadClass(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " " + "From Thread" + " " + threadNumber);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 2; i++) {
            ThreadClass threadClass = new ThreadClass(i);
            threadClass.start();  // How many time Start methods gets executed that's the count of thread!
        }
    }
}