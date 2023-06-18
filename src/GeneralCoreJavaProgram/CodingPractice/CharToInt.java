package GeneralCoreJavaProgram.CodingPractice;

import java.util.Scanner;

public class CharToInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Char");
        char a = scanner.next().charAt(0);
        System.out.println("Enter the Second Char");
        char b = scanner.next().charAt(0);

        int number1 = a;
        int number2 = b;

        System.out.println("The char to int value is  " + number1 + "&" + number2);
    }
}

