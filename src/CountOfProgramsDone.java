import GeneralCoreJavaProgram.CodingPrograms.CountOfProgramsInCodingProgram;
import GeneralCoreJavaProgram.DataTypes.CountOfProgramsInDataTypes;
import GeneralCoreJavaProgram.EncapsulationExample.CountOfProgramsInEncapsulation;
import GeneralCoreJavaProgram.ObjectsExample.CountOfProgramsInObjectsExample;
import GeneralCoreJavaProgram.PolymorphismExample.CountOfProgramsInPolymorphism;
import GeneralCoreJavaProgram.UserInputPrograms.CountOfProgramsInUserInput;
import GeneralCoreJavaProgram.abstractionExample.CountOfProgramsInAbstraction;

public class CountOfProgramsDone {
    public static void main(String[] args) {
        CountOfProgramsInAbstraction countOfProgramsInAbstraction = new CountOfProgramsInAbstraction();
        CountOfProgramsInEncapsulation countOfProgramsInEncapsulation = new CountOfProgramsInEncapsulation();
        CountOfProgramsInPolymorphism countOfProgramsInPolymorphism = new CountOfProgramsInPolymorphism();
        CountOfProgramsInDataTypes countOfProgramsGeneralCoreJavaProgram = new CountOfProgramsInDataTypes();
        CountOfProgramsInCodingProgram countOfProgramsInCodingProgram = new CountOfProgramsInCodingProgram();
        CountOfProgramsInUserInput countOfProgramsInUserInput = new CountOfProgramsInUserInput();
        CountOfProgramsInObjectsExample countOfProgramsInObjectsExample = new CountOfProgramsInObjectsExample();

        int[] files = {countOfProgramsGeneralCoreJavaProgram.returnFileCount(), countOfProgramsInCodingProgram.returnFileCount(), countOfProgramsInUserInput.returnFileCount(), countOfProgramsInObjectsExample.returnFileCount(),countOfProgramsInAbstraction.returnFileCount(),countOfProgramsInEncapsulation.returnFileCount(),countOfProgramsInPolymorphism.returnFileCount()};
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
