import GeneralCoreJavaProgram.Arrays.CountOfProgramsInArrays;
import GeneralCoreJavaProgram.CodingPractice.CountOfProgramsInCodingPractice;
import GeneralCoreJavaProgram.DataTypes.CountOfProgramsInDataTypes;
import GeneralCoreJavaProgram.EncapsulationExample.CountOfProgramsInEncapsulation;
import GeneralCoreJavaProgram.ExceptionHandling.CountOfProgramsInExceptionPackage;
import GeneralCoreJavaProgram.FileIO.CountOfProgramsInFileIO;
import GeneralCoreJavaProgram.InheritanceExample.CountOfProgramsInInheritance;
import GeneralCoreJavaProgram.Loops.CountOfProgramsInLoops;
import GeneralCoreJavaProgram.ObjectsExample.CountOfProgramsInObjectsExample;
import GeneralCoreJavaProgram.PolymorphismExample.CountOfProgramsInPolymorphism;
import GeneralCoreJavaProgram.UserInputPrograms.CountOfProgramsInUserInput;
import GeneralCoreJavaProgram.abstractionExample.AbstractClassExample.CountOfProgramsInAbstraction;
import GeneralCoreJavaProgram.abstractionExample.InterfaceExample.CountOfProgramsInInterface;
import GeneralCoreJavaProgram.enums.CountOfProgramsInEnum;
import GeneralCoreJavaProgram.serialization.CountOfProgramsSerialization;

import java.util.Arrays;

public class CountOfProgramsDone {
    public static void main(String[] args) {
        CountOfProgramsInAbstraction countOfProgramsInAbstraction = new CountOfProgramsInAbstraction();
        CountOfProgramsInArrays countOfProgramsInArrays = new CountOfProgramsInArrays();
        CountOfProgramsInInterface countOfProgramsInInterface = new CountOfProgramsInInterface();
        CountOfProgramsInCodingPractice countOfProgramsInCodingPractice = new CountOfProgramsInCodingPractice();
        CountOfProgramsInDataTypes countOfProgramsInDataTypes = new CountOfProgramsInDataTypes();
        CountOfProgramsInInheritance countOfProgramsInInheritance = new CountOfProgramsInInheritance();
        CountOfProgramsInExceptionPackage countOfProgramsInExceptionPackage = new CountOfProgramsInExceptionPackage();
        CountOfProgramsInFileIO countOfProgramsInFileIO = new CountOfProgramsInFileIO();
        CountOfProgramsInEncapsulation countOfProgramsInEncapsulation = new CountOfProgramsInEncapsulation();
        CountOfProgramsInEnum countOfProgramsInEnum = new CountOfProgramsInEnum();
        CountOfProgramsInLoops countOfProgramsInLoops = new CountOfProgramsInLoops();
        CountOfProgramsInObjectsExample countOfProgramsInObjectsExample = new CountOfProgramsInObjectsExample();
        CountOfProgramsSerialization countOfProgramsSerialization = new CountOfProgramsSerialization();
        CountOfProgramsInPolymorphism countOfProgramsInPolymorphism = new CountOfProgramsInPolymorphism();
        CountOfProgramsInUserInput countOfProgramsInUserInput = new CountOfProgramsInUserInput();

        int[] files = {countOfProgramsInDataTypes.returnFileCount(), countOfProgramsInUserInput.returnFileCount(), countOfProgramsInObjectsExample.returnFileCount(), countOfProgramsInAbstraction.returnFileCount(), countOfProgramsInEncapsulation.returnFileCount(), countOfProgramsInPolymorphism.returnFileCount(), countOfProgramsInInterface.returnFileCount(), countOfProgramsInCodingPractice.returnFileCount(), countOfProgramsInInheritance.returnFileCount(), countOfProgramsInArrays.returnFileCount(), countOfProgramsInExceptionPackage.returnFileCount(), countOfProgramsSerialization.returnFileCount(), countOfProgramsInEnum.returnFileCount(), countOfProgramsInLoops.returnFileCount(),countOfProgramsInFileIO.returnFileCount()};
        sumOfProgramsWeDidTillNow(files, countOfProgramsInCodingPractice);
    }

    public static void sumOfProgramsWeDidTillNow(int[] files, CountOfProgramsInCodingPractice countOfProgramsInCodingPractice) {
        int sum = Arrays.stream(files).sum();
        System.out.println("Programs in Coding Practice" + " " + countOfProgramsInCodingPractice.returnFileCount());
        System.out.println("Total Number of Packages" + "::" + files.length);
        System.out.println("Total Number of Programs Done till Now" + "::" + (sum - files.length));
    }
}
