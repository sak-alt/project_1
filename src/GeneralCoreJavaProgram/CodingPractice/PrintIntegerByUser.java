package GeneralCoreJavaProgram.CodingPractice;

import java.util.Scanner;

public class PrintIntegerByUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = scanner.nextInt();
        System.out.println("The Number Entered by You is" + "::" + number);
    }
}
