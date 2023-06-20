package GeneralCoreJavaProgram.ExceptionHandling;

public class TryCatchFinallyUnAcceptable {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        try {
            System.out.println(numbers[3]);
//            finally {
//                System.out.println("I will always execute");
//            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Welcome to exception world");
        }
    }
}
