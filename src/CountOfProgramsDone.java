import GeneralCoreJavaProgram.CodingPractice.CountOfProgramsInCodingPractice;
import GeneralCoreJavaProgram.DataTypes.CountOfProgramsInDataTypes;
import GeneralCoreJavaProgram.EncapsulationExample.CountOfProgramsInEncapsulation;
import GeneralCoreJavaProgram.ObjectsExample.CountOfProgramsInObjectsExample;
import GeneralCoreJavaProgram.PolymorphismExample.CountOfProgramsInPolymorphism;
import GeneralCoreJavaProgram.UserInputPrograms.CountOfProgramsInUserInput;
import GeneralCoreJavaProgram.abstractionExample.AbstractClassExample.CountOfProgramsInAbstraction;
import GeneralCoreJavaProgram.abstractionExample.InterfaceExample.CountOfProgramsInInterface;

public class CountOfProgramsDone {
    public static void main(String[] args) {
        CountOfProgramsInAbstraction countOfProgramsInAbstraction = new CountOfProgramsInAbstraction();
        CountOfProgramsInInterface countOfProgramsInInterface = new CountOfProgramsInInterface();
        CountOfProgramsInCodingPractice countOfProgramsInCodingPractice = new CountOfProgramsInCodingPractice();
        CountOfProgramsInDataTypes countOfProgramsInDataTypes = new CountOfProgramsInDataTypes();
        CountOfProgramsInEncapsulation countOfProgramsInEncapsulation = new CountOfProgramsInEncapsulation();
        CountOfProgramsInObjectsExample countOfProgramsInObjectsExample = new CountOfProgramsInObjectsExample();
        CountOfProgramsInPolymorphism countOfProgramsInPolymorphism = new CountOfProgramsInPolymorphism();
        CountOfProgramsInUserInput countOfProgramsInUserInput = new CountOfProgramsInUserInput();

        int[] files = {countOfProgramsInDataTypes.returnFileCount(), countOfProgramsInUserInput.returnFileCount(), countOfProgramsInObjectsExample.returnFileCount(), countOfProgramsInAbstraction.returnFileCount(), countOfProgramsInEncapsulation.returnFileCount(), countOfProgramsInPolymorphism.returnFileCount(), countOfProgramsInInterface.returnFileCount(),countOfProgramsInCodingPractice.returnFileCount()};
        sumOfProgramsWeDidTillNow(files);
    }

    public static void sumOfProgramsWeDidTillNow(int[] files) {
        int sum = 0;
        for (int file : files) {
            sum = sum + file;
        }
        System.out.println("Total Number of Packages" + "::" + files.length);
        System.out.println("Total Number of Programs Done till Now" + "::" + sum);
    }
}
