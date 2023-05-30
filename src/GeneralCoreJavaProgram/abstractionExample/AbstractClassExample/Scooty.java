package GeneralCoreJavaProgram.abstractionExample.AbstractClassExample;

public class Scooty extends Vehicle{
    @Override
    public void tyres() {
        System.out.println("In Scooty we have two Tyres");
    }

    @Override
    public void start() {
        System.out.println("In Scooty we start with self-start");
    }
}
