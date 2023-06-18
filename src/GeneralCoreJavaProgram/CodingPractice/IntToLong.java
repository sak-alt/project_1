package GeneralCoreJavaProgram.CodingPractice;

import java.util.Scanner;

public class IntToLong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Value");
        int value6 = scanner.nextInt();
        System.out.println("Enter the Second Value");
        int value7 = scanner.nextInt();


        long number1 = value6;
        long number2 = value7;

        System.out.println("The Long to int value is  " + number1 + "&" + number2);
    }
}
