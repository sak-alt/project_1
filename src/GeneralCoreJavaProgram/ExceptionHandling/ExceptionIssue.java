package GeneralCoreJavaProgram.ExceptionHandling;

public class ExceptionIssue {
    public static void main(String[] args) {
        int[] number1 = {1, 2};

        try {
            System.out.println(number1[2]);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            exception.printStackTrace();
            System.out.println("Cab");
        }
    }
}
