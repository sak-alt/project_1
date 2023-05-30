package GeneralCoreJavaProgram.CodingPractice;

import java.util.Scanner;

public class AsciiValueOfCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Character?");
        String str = scanner.nextLine();
        char[] ch = str.toCharArray();

        int character = ch[0];
        System.out.println("The Ascii Value of the Character is ::" + " " + character);
    }
}
