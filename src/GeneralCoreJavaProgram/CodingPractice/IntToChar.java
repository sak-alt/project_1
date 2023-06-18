package GeneralCoreJavaProgram.CodingPractice;

import java.util.Scanner;

public class IntToChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int number1 = scanner.nextInt();
        System.out.println("Enter the Second Number");
        int number2 = scanner.nextInt();

        char a = (char) number1;
        char b = (char) number2;

        System.out.println("The int to char value is  " + a + "&" + b);
    }
}
