package GeneralCoreJavaProgram.Loops;

public class EnhancedForLoops {
    public static void main(String[] args) {
        double[] numArray = {1, 2, 3, 4, 5};
        double sum = 0;
        double sum1 = 0;
        //Indexed-Loop
        for (int i = 0; i < numArray.length; i++) {
            double numbers = numArray[i];
            sum = sum + numbers;
        }
        //Enhanced-For-Loop
        for (double values : numArray) {
            sum1 = sum1 + values;
        }
        System.out.println(sum);
        System.out.println(sum1);
    }
}
