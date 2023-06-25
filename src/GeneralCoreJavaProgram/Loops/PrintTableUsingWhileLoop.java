package GeneralCoreJavaProgram.Loops;

public class PrintTableUsingWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        int table = 10;
        while (i <= table) {
            System.out.print(i * table + " ");
            ++i;
        }
    }
}
