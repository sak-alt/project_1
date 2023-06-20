package GeneralCoreJavaProgram.ExceptionHandling;

public class TryCatchFinally {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        try {
            System.out.println(numbers[3]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Welcome to exception world");
        } finally {
            System.out.println("I will always execute");
        }
    }
}
