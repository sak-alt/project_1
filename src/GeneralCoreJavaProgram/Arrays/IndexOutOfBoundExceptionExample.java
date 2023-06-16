package GeneralCoreJavaProgram.Arrays;

public class IndexOutOfBoundExceptionExample {
    public static void main(String[] args) {
        int[] numbers = new int[2];
        numbers[0] = 10;
        numbers[1] = 20;

        System.out.println(numbers[2]);
    }
}

