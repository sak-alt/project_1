package GeneralCoreJavaProgram.CodingPractice;

public class AverageOfArrays {
    public static void main(String[] args) {
        double[] numArray = {45, 67, 20, 33, 45};
        double average;
        double sum = 0;
        for (int i = 0; i < numArray.length; i++) {
            sum = sum + numArray[i];
        }
        average = sum / numArray.length;
        System.out.println("The Average Of Student Marks is" + " " + average);
    }
}
