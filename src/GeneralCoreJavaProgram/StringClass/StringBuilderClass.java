package GeneralCoreJavaProgram.StringClass;

public class StringBuilderClass {
    public static void main(String[] args) {
        //Thread Safe
        //One By One
        //mutable(can be changed)
        StringBuilder stringBuilder = new StringBuilder("Nitesh");
        stringBuilder.append("Bhushan");
        System.out.println(stringBuilder);
    }
}
