package GeneralCoreJavaProgram.Loops;

public class PrintTheSumUsingDoWhileLoop {
    public static void main(String[] args) {
        int lastNumber = 100;
        int sum = 0;
        int i = 0;
        while (i <= lastNumber) {
            sum = sum + i;
            i++;
        }
        System.out.println("The Sum is ::" + " " + sum);
    }
}
