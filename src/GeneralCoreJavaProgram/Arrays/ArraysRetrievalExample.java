package GeneralCoreJavaProgram.Arrays;

public class ArraysRetrievalExample {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;

        System.out.println(numbers[3]);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
