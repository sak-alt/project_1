package GeneralCoreJavaProgram.CodingPractice;

import java.util.Scanner;

public class PrintTables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number for which you required to get Table");
        int number = scanner.nextInt();

        for (int i = 1; i <= 20; i++) {
            int table = number * i;
            System.out.println(table);
        }

    }
}
