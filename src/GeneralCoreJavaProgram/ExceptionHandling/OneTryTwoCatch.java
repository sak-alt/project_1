package GeneralCoreJavaProgram.ExceptionHandling;

public class OneTryTwoCatch {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        try {
            System.out.println(numbers[3]);
        } catch (NullPointerException exception) {
            System.out.println("Welcome to exception world from 1st Catch Block");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Welcome to exception world from 2nd Catch Block");
        }
    }
}
