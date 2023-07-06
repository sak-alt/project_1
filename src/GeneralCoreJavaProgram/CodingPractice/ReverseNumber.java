package GeneralCoreJavaProgram.CodingPractice;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 405;
        String name = String.valueOf(Integer.valueOf(number));
        StringBuilder reverse = new StringBuilder();
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse.append(name.charAt(i));
        }
        System.out.println(reverse);
    }
}

