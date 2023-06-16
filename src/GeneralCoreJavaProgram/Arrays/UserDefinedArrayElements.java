package GeneralCoreJavaProgram.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class UserDefinedArrayElements {
    public static void main(String[] args) {
        int[] numbers = new int[2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first element?");
        numbers[0] = scanner.nextInt();
        System.out.println("Enter the second element?");
        numbers[1] = scanner.nextInt();

        System.out.println(Arrays.toString(numbers));
    }
}
