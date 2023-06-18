package GeneralCoreJavaProgram.CodingPractice;

import java.util.Scanner;

public class LongToInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Value");
        long value6 = scanner.nextLong();
        System.out.println("Enter the Second Value");
        long value7 = scanner.nextLong();


        int number1 = (int) value6;
        int number2 = (int) value7;

        System.out.println("The Long to int value is  " + number1 + "&" + number2);
    }

}
