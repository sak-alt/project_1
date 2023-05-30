package GeneralCoreJavaProgram.CodingPractice;

import java.util.Scanner;

public class MultiplicationOfFloat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Value?");
        float value3 = scanner.nextFloat();
        System.out.println("Enter the Second Value?");
        float value4 = scanner.nextFloat();

        float product = value3 * value4;

        System.out.println("The product is " + ":" + product);
    }
}
