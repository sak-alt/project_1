package GeneralCoreJavaProgram.CodingPractice;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of string 1: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the value of string 2: ");
        String str2 = sc.nextLine();
        System.out.println("Yes they are anagram " + checkAnAnagramStatus(str1, str2));
    }

    private static boolean checkAnAnagramStatus(String str1, String str2) {
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        boolean result = Arrays.equals(charArray1, charArray2);
        if (result && (str1.length() != str2.length())) {
            return false;
        } else {
            return true;
        }
    }
}
