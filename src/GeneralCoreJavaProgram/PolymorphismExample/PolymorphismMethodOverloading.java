package GeneralCoreJavaProgram.PolymorphismExample;

public class PolymorphismMethodOverloading {
    public static void main(String[] args) {
        System.out.println(getSum(10, 20));
        System.out.println(getSum(10, 20, 30));
        System.out.println(getSum(10, 20, 30, 40));
    }

    public static int getSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int getSum(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }

    public static int getSum(int a, int b, int c, int d) {
        int sum = a + b + c + d;
        return sum;
    }
}
