package GeneralCoreJavaProgram.UserInputPrograms;

import java.util.Scanner;

public class ScannerInputTypesExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Value?");
        int value1 = scanner.nextInt();
        System.out.println("Enter the Second Value?");
        int value2 = scanner.nextInt();

        int sum = value1 + value2;
        System.out.println("Sum of two number is::" + " " + sum);
    }
}
