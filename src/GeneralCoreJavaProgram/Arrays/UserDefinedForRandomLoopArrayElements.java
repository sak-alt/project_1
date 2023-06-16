package GeneralCoreJavaProgram.Arrays;

import java.util.Random;
import java.util.Scanner;

public class UserDefinedForRandomLoopArrayElements {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of an Array?");
        int sizeOfArray = scanner.nextInt();
        int[] numbers = new int[sizeOfArray];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
