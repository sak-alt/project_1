package GeneralCoreJavaProgram.CodingPractice;

import java.util.Scanner;

public class GreatestOfThreeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Value?");
        int value1 = scanner.nextInt();
        System.out.println("Enter the Second Value?");
        int value2 = scanner.nextInt();
        System.out.println("Enter the Third Value?");
        int value3 = scanner.nextInt();

        if (value1 >= value2 && value1 >= value3) {
            System.out.println("Value 1 is Greatest" + " " + value1);
        } else if (value2 >= value1 && value2 >= value3) {
            System.out.println("Value 2 is Greatest" + " " + value2);
        } else {
            System.out.println("Value 3 is Greatest" + " " + value3);
        }
    }
}
