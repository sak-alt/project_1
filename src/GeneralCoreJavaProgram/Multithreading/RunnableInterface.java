package GeneralCoreJavaProgram.Multithreading;

public class RunnableInterface implements Runnable {

    private int threadNumber;

    public RunnableInterface(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
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