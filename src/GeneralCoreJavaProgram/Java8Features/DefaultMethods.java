package GeneralCoreJavaProgram.Java8Features;

interface Vehicle {
    void start();
    default void stop() {
        System.out.println("Stopping the Car");
    }
}

class Cars implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car should start");
    }
}

public class DefaultMethods {
    public static void main(String[] args) {
        Cars cars = new Cars();
        cars.start();
        cars.stop();
    }
}
