package GeneralCoreJavaProgram.abstractionExample.AbstractClassExample;

public class Car extends Vehicle{

    @Override
    public void tyres() {
        System.out.println("Car has 4 Tyres");
    }

    @Override
    public void start() {
        System.out.println("Car start with an Ignition");
    }
}
