package GeneralCoreJavaProgram.CodingPractice;

import java.util.Scanner;

// x2 - 5x + 6
public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the b Value?");
        int b = scanner.nextInt();
        System.out.println("Enter the a Value?");
        int a = scanner.nextInt();
        System.out.println("Enter the c Value?");
        int c = scanner.nextInt();

        int discriminant = b * b - 4 * a * c;
        System.out.println("Discriminant of the Equation is" + " " + discriminant);

        double root1 = (-b + Math.sqrt(discriminant)) / 2 * a;
        double root2 = (-b - Math.sqrt(discriminant)) / 2 * a;

        System.out.println("Roots of the Equation is" + " " + root1 + " " + root2);
    }
}
