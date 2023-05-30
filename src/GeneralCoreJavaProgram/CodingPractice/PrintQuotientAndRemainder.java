package GeneralCoreJavaProgram.CodingPractice;

import java.util.Scanner;

public class PrintQuotientAndRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int dividend = scanner.nextInt();
        System.out.println("Enter the divisor");
        int divisor = scanner.nextInt();

        int Quotient = dividend / divisor;
        int Remainder = dividend % divisor;

        System.out.println("The Quotient is" + ":" + Quotient);
        System.out.println("The Remainder is" + ":" + Remainder);
    }
}
