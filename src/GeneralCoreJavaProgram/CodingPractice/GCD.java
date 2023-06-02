package GeneralCoreJavaProgram.CodingPractice;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        int gcd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Value?");
        int value1 = scanner.nextInt();
        System.out.println("Enter the Second Value?");
        int value2 = scanner.nextInt();

        gcd = getGcd(value1, value2);
        System.out.println("GCD of the following is" + " " + gcd);
    }

    public static int getGcd(int value1, int value2) {
        int gcd = 0;
        int largest = Math.max(value1, value2);
        for (int i = 1; i <= largest; i++) {
            if (value1 % i == 0 && value2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
