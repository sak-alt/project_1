package GeneralCoreJavaProgram.ExceptionHandling;

public class OneTryOneCatchNested {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        try {
            try {
                System.out.println(numbers[3]);
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Welcome to nested Exception world");
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Welcome to exception world");
        }
    }
}
