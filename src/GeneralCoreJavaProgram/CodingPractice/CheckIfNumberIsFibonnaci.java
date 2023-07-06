package GeneralCoreJavaProgram.CodingPractice;

import java.util.Scanner;

public class CheckIfNumberIsFibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value for which you want to check the series: ");
        int n = sc.nextInt();
        if (checkFibonnaciNumber(n)) {
            System.out.println("The number" + " " + n + " " + "is in Fibonnaci Series");
        } else {
            System.out.println("The number" + " " + n + " " + "is not in Fibonnaci Series");
        }
    }

    private static boolean checkFibonnaciNumber(int n) {
        int tillRun = 20;
        int firstTerm, secondTerm = 0, nextTerm = 1;
        for (int i = 1; i <= tillRun; i++) {
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            nextTerm = firstTerm + secondTerm;
            if (n == firstTerm) {
                return true;
            }
        }
        return false;
    }
}
