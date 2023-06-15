import GeneralCoreJavaProgram.Arrays.CountOfProgramsInArrays;
import GeneralCoreJavaProgram.CodingPractice.CountOfProgramsInCodingPractice;
import GeneralCoreJavaProgram.DataTypes.CountOfProgramsInDataTypes;
import GeneralCoreJavaProgram.EncapsulationExample.CountOfProgramsInEncapsulation;
import GeneralCoreJavaProgram.InheritanceExample.CountOfProgramsInInheritance;
import GeneralCoreJavaProgram.ObjectsExample.CountOfProgramsInObjectsExample;
import GeneralCoreJavaProgram.PolymorphismExample.CountOfProgramsInPolymorphism;
import GeneralCoreJavaProgram.UserInputPrograms.CountOfProgramsInUserInput;
import GeneralCoreJavaProgram.abstractionExample.AbstractClassExample.CountOfProgramsInAbstraction;
import GeneralCoreJavaProgram.abstractionExample.InterfaceExample.CountOfProgramsInInterface;

import java.util.Arrays;

public class CountOfProgramsDone {
    public static void main(String[] args) {
        CountOfProgramsInAbstraction countOfProgramsInAbstraction = new CountOfProgramsInAbstraction();
        CountOfProgramsInArrays countOfProgramsInArrays = new CountOfProgramsInArrays();
        CountOfProgramsInInterface countOfProgramsInInterface = new CountOfProgramsInInterface();
        CountOfProgramsInCodingPractice countOfProgramsInCodingPractice = new CountOfProgramsInCodingPractice();
        CountOfProgramsInDataTypes countOfProgramsInDataTypes = new CountOfProgramsInDataTypes();
        CountOfProgramsInInheritance countOfProgramsInInheritance = new CountOfProgramsInInheritance();
        CountOfProgramsInEncapsulation countOfProgramsInEncapsulation = new CountOfProgramsInEncapsulation();
        CountOfProgramsInObjectsExample countOfProgramsInObjectsExample = new CountOfProgramsInObjectsExample();
        CountOfProgramsInPolymorphism countOfProgramsInPolymorphism = new CountOfProgramsInPolymorphism();
        CountOfProgramsInUserInput countOfProgramsInUserInput = new CountOfProgramsInUserInput();

        int[] files = {countOfProgramsInDataTypes.returnFileCount(), countOfProgramsInUserInput.returnFileCount(), countOfProgramsInObjectsExample.returnFileCount(), countOfProgramsInAbstraction.returnFileCount(), countOfProgramsInEncapsulation.returnFileCount(), countOfProgramsInPolymorphism.returnFileCount(), countOfProgramsInInterface.returnFileCount(), countOfProgramsInCodingPractice.returnFileCount(), countOfProgramsInInheritance.returnFileCount(), countOfProgramsInArrays.returnFileCount()};
        sumOfProgramsWeDidTillNow(files, countOfProgramsInCodingPractice);
    }

    public static void sumOfProgramsWeDidTillNow(int[] files, CountOfProgramsInCodingPractice countOfProgramsInCodingPractice) {
        int sum = Arrays.stream(files).sum();
        System.out.println("Programs in Coding Practice" + " " + countOfProgramsInCodingPractice.returnFileCount());
        System.out.println("Total Number of Packages" + "::" + files.length);
        System.out.println("Total Number of Programs Done till Now" + "::" + (sum - files.length));
    }
}
