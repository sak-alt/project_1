package GeneralCoreJavaProgram.CodingPractice;

public class CharFrequency {
    public static void main(String[] args) {
        String str = "Nitesh";
        int freq = 0;
        for (int i = 0; i <= str.length()-1; i++) {
            char c = str.charAt(i);
            if (c == str.charAt(i)) {
                freq++;
            }
        }
        System.out.println("Welcome to Java");
        System.out.println("The frequency of a character in the string is : " + freq);
    }
}
