package GeneralCoreJavaProgram.CodingPractice;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Value?");
        int value1 = scanner.nextInt();
        System.out.println("Enter the Second Value?");
        int value2 = scanner.nextInt();
        GCD gcd = new GCD();
        double gcdValue = gcd.getGcd(value1, value2);
        double lcm = (value1 * value2) / gcdValue;
        System.out.println("Lcm of the Numbers are" + " " + lcm);
    }
}