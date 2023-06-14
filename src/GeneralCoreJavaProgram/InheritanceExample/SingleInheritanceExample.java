package GeneralCoreJavaProgram.InheritanceExample;

//Parent class
class Birds {
    public void canFly() {
        System.out.println("Every Bird Can fly");
    }
}

// Child Class
class Parrot extends Birds{
    public void talk() {
        System.out.println("Parrot Can Talk Beautifully");
    }
}

public class SingleInheritanceExample {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        parrot.talk();
        parrot.canFly();
    }
}
