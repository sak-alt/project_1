package GeneralCoreJavaProgram.CodingPractice;

import java.util.Scanner;

public class ArmStrongCode {

    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number?");
        int number = scanner.nextInt();

        int temp = number;

        while (temp != 0) {
            int remainder = temp % 10;
            sum += remainder * remainder * remainder;
            temp = temp / 10;
        }

        if (sum == number) {
            System.out.println("It is an ArmStrong Number");
        } else {
            System.out.println("It is not an Armstrong Number");
        }
    }
}
