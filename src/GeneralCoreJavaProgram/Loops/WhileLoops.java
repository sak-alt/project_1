package GeneralCoreJavaProgram.Loops;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number?");
        number = scanner.nextInt();

        while (number != 0) {
            System.out.println("You have entered the number" + " " + number);
            System.out.println("Enter the next number?");
            number = scanner.nextInt();
        }
        System.out.println("Let's Quit someone entered zero" + " " + number);
    }
}
