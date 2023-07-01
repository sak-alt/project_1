package GeneralCoreJavaProgram.CodingPractice;

public class VowelsInString {
    public static void main(String[] args) {
        String message = "Welcome to Java";
        message = message.replaceAll("\\s+", "");
        System.out.println(message);
        char[] chars = message.toCharArray();
        System.out.println(checkVowels(message, chars) + " " + "the Vowels exist for this String");
    }

    private static boolean checkVowels(String message, char[] chars) {
        for (int i = 0; i < message.length(); i++) {
            if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u') {
                return true;
            }
        }
        return false;
    }
}
