package GeneralCoreJavaProgram.abstractionExample.InterfaceExample;

public class VehicleMainMethod {
    public static void main(String[] args) {
        Scooty scooty = new Scooty();
        scooty.tyres();
        scooty.start();
        scooty.engine();

        Car car = new Car();
        car.start();
        car.tyres();
        car.engine();
    }
}
