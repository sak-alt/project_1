package GeneralCoreJavaProgram.ObjectsExample;

public class ObjectCreationExample {
    public static void main(String[] args) {
        AdditionProgram additionProgram = new AdditionProgram();
        int sum = additionProgram.additionProgram(20, 10);

        SubtractionProgram subtractionProgram = new SubtractionProgram();
        int sub = subtractionProgram.subtractionProgram(20, 10);

        int multiplication = sum * sub;
        System.out.println(multiplication);
    }
}
