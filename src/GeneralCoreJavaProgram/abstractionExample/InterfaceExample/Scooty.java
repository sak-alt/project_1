package GeneralCoreJavaProgram.abstractionExample.InterfaceExample;

public class Scooty implements Vehicle {

    @Override
    public void tyres() {
        System.out.println("Scooty has Four Tyres");
    }

    @Override
    public void start() {
        System.out.println("Scooty Can Start with Self");
    }

    @Override
    public void engine() {
        System.out.println("Scooty engine is small");
    }
}
