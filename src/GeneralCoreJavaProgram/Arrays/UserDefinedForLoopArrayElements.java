package GeneralCoreJavaProgram.Arrays;

import java.util.Scanner;

public class UserDefinedForLoopArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of an Array?");
        int sizeOfArray = scanner.nextInt();
        int[] numbers = new int[sizeOfArray];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the" + " " + (i + 1) + " " + "element?");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
