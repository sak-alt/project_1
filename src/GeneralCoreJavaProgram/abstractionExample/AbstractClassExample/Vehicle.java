package GeneralCoreJavaProgram.abstractionExample.AbstractClassExample;

abstract class Vehicle {

    public abstract void tyres();

    public abstract void start();

    public void engine() {
        System.out.println("Engine Start with an Wire");
    }
}
