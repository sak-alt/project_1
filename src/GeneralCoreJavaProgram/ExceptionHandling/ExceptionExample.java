package GeneralCoreJavaProgram.ExceptionHandling;

public class ExceptionExample {
    public static void main(String[] args) {
        int[] number1 = {1, 2, 3};

        try {
            System.out.println(number1[2]);
        } catch (Exception exception) {
            System.out.println("The exception has occurred in try block");
        }
    }
}
