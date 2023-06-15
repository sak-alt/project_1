package GeneralCoreJavaProgram.CodingPractice;

public class SumOfArrays {
    public static void main(String[] args) {
        double[] numArray = {45, 67, 20, 33, 45};
        double sum = 0;
        for (int i = 0; i < numArray.length; i++) {
            sum = sum + numArray[i];
        }
        System.out.println("Sum of Student Marks is" + " " + sum);
    }
}
