package GeneralCoreJavaProgram.PolymorphismExample;

class Cars {
    public void start() {
        System.out.println("I can be started in multiple ways");
    }
}

class Maruti extends Cars {
    @Override
    public void start() {
        System.out.println("I can be started by Ignition");
    }
}

class Main {
    public static void main(String[] args) {
        Maruti maruti = new Maruti();
        maruti.start();
    }
}
