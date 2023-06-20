package GeneralCoreJavaProgram.ExceptionHandling;

public class IndexOutOfBoundException extends Throwable {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        System.out.println(numbers[3]);
    }
}
