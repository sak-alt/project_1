package GeneralCoreJavaProgram.InheritanceExample;

//GrandParent class
class Bike {
    public void haveTyre() {
        System.out.println("Every Bike has 2 Tyres");
    }
}

// Parent Class
class Bullet extends Bike {
    public void noise() {
        System.out.println("Bullet makes lots of Noise");
    }
}

// Child Class
class Scooty extends Bullet {
    public void riskStatus() {
        System.out.println("Girls driving is Risky");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Scooty scooty = new Scooty();
        scooty.riskStatus();
        scooty.noise();

        Bullet bullet = new Bullet();
        bullet.noise();
        bullet.haveTyre();
    }
}
