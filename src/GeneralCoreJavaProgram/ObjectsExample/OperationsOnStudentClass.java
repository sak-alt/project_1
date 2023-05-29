package GeneralCoreJavaProgram.ObjectsExample;

public class OperationsOnStudentClass {
    public static void main(String[] args) {
        Students students1 = new Students(20,"Nitesh");
        Students students2 = new Students(30,"bhushan");
        Students students3 = new Students();

        System.out.println(students1.name);
        System.out.println(students2.name);
    }
}
