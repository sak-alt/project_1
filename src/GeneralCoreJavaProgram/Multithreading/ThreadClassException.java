package GeneralCoreJavaProgram.Multithreading;

public class ThreadClassException extends Thread {

    private int threadNumber;

    public ThreadClassException(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " " + "From Thread" + " " + threadNumber);
            if(threadNumber==1){
                throw new RuntimeException();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 2; i++) {
            ThreadClassException threadClass = new ThreadClassException(i);
            threadClass.start();  // How many time Start methods gets executed that's the count of thread!
        }
    }
}