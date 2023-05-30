package GeneralCoreJavaProgram.CodingPractice;

public class IdentifierRecommendation {
    public static void main(String[] args) {
        int numberOne = 10;
        int numberTwo = 20;
        String nameValue = "Sakhi";
        System.out.println("welcome to java");
        System.out.println(numberTwo + numberOne);
        System.out.println(nameValue);
        additionOfTwoNumber(numberOne, numberTwo);
        subtractionOfTwoNumber(numberOne, numberTwo);
    }

    public static void additionOfTwoNumber(int numberOne, int numberTwo) {
        int sum;
        sum = numberOne + numberTwo;
        System.out.println(sum);
    }

    public static void subtractionOfTwoNumber(int numberOne, int numberTwo) {
        int sub;
        sub = numberOne - numberTwo;
        System.out.println(sub);
    }
}
