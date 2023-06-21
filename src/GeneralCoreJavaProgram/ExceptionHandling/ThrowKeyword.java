package GeneralCoreJavaProgram.ExceptionHandling;

import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age of the Voter?");
        int age = scanner.nextInt();

        if (age < 18) {
            throw new YoungAgeException("You are not eligible for voting");
        } else {
            System.out.println("You can vote for sure!");
        }
    }
}
