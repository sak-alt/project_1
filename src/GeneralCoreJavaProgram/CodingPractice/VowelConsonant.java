package GeneralCoreJavaProgram.CodingPractice;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Character?");
        String str = scanner.nextLine();
        char[] ch = str.toLowerCase().toCharArray();

        if (ch[0] == 'a' || ch[0] == 'e' || ch[0] == 'i' || ch[0] == 'o' || ch[0] == 'u') {
            System.out.println("Character" + " " + ch[0] + " " + "is Vowel");
        } else {
            System.out.println("Character" + " " + ch[0] + " " + "is Consonant");
        }
    }
}
