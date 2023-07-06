package GeneralCoreJavaProgram.CodingPractice;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153;
        int originalNumber = number;
        int sum = 0;
        int numDigits = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }
        if (sum != originalNumber) {
            System.out.println("Number is not an ArmStrong Number");
        } else {
            System.out.println("Its an ArmStrong Number");
        }
    }
}
