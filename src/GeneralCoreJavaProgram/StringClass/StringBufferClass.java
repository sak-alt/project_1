package GeneralCoreJavaProgram.StringClass;

public class StringBufferClass {
    public static void main(String[] args) {
        //Non-Thread Safe
        //Parallel Contribution , much faster
        //mutable(Can be changed)
        StringBuffer stringBuffer = new StringBuffer("Nitesh");
        stringBuffer.append("Bhushan");
        System.out.println(stringBuffer);
    }
}
