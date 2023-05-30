package GeneralCoreJavaProgram.abstractionExample.InterfaceExample;

public class Car implements Vehicle {


    @Override
    public void tyres() {
        System.out.println("Scooty has 4 Tyres");
    }

    @Override
    public void start() {
        System.out.println("Scooty Can get started with Ignition");
    }

    @Override
    public void engine() {
        System.out.println("Scooty engine is Big");
    }
}
