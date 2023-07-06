package GeneralCoreJavaProgram.CodingPractice;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value till which you require to print the series::?");
        int n = sc.nextInt();
        int number1 = 0, number2 = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(number1 + " ");
            int sum = number1 + number2;
            number1 = number2;
            number2 = sum;
        }
    }
}
