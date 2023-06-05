package GeneralCoreJavaProgram.InheritanceExample;

//Child Class
class InheritancePart1 {
    public static void getName1() {
        System.out.println("My name is Bhushan");
    }
}

//Parent Class
class InheritancePart2 extends InheritancePart1{
    public static void getName() {
        System.out.println("My name is Nitesh");
    }
}

public class InheritancePart3 {
    public static void main(String[] args) {
        InheritancePart2 polymorphismOverRidingPart4 = new InheritancePart2();
        polymorphismOverRidingPart4.getName();
        polymorphismOverRidingPart4.getName1();
    }
}
