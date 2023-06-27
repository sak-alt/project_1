package GeneralCoreJavaProgram.CodingPractice;

public class AverageOfArrays {
    public static void main(String[] args) {
        double[] numArray = {45, 67, 20, 33, 45};
        double average;
        double sum = 0;
        for (double v : numArray) {
            sum = sum + v;
        }
        average = sum / numArray.length;
        System.out.println("The Average Of Student Marks is" + " " + average);
    }
}
