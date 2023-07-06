package GeneralCoreJavaProgram.CodingPractice;

public class ReverseWord {
    public static void main(String[] args) {
        String name = "Nitesh I am happy";
        String reversedWord = "";
        char[] chars = name.toCharArray();
        for (char aChar : chars) {
            reversedWord = aChar + reversedWord;
        }
        System.out.println(reversedWord);
    }
}
