package GeneralCoreJavaProgram.InheritanceExample;

//Parent class
class Car {
    public void haveTyre() {
        System.out.println("Every Car has 4 Tyres");
    }
}

// Child Class
class Hyundai extends Car {
    public void hyundaiNoise() {
        System.out.println("Hyundai is a noisy Car");
    }
}

// Child Class
class Suzuki extends Car {
    public void riskStatus() {
        System.out.println("Suzuki is a Risky Car");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Hyundai hyundai = new Hyundai();
        hyundai.hyundaiNoise();
        hyundai.haveTyre();

        Suzuki suzuki = new Suzuki();
        suzuki.riskStatus();
        suzuki.haveTyre();
    }
}
