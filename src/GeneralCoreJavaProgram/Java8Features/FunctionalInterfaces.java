package GeneralCoreJavaProgram.Java8Features;

//@-(Annonation)
@FunctionalInterface
interface FunctionalInterfaceConcept {
    int calculator(int a, int b);
}

public class FunctionalInterfaces {
    public static void main(String[] args) {
        FunctionalInterfaceConcept addition = (a, b) -> a + b;
        int result = addition.calculator(2, 3);
        System.out.println(result);
    }
}
