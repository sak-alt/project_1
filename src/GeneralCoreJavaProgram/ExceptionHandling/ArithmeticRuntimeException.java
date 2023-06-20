package GeneralCoreJavaProgram.ExceptionHandling;

import java.util.Scanner;

public class ArithmeticRuntimeException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int numbers = scanner.nextInt();
        int number = 20;
        int result = number / numbers;
        System.out.println(result);
    }
}
