import GeneralCoreJavaProgram.CodingPrograms.CountOfProgramsInCodingProgram;
import GeneralCoreJavaProgram.DataTypes.CountOfProgramsInDataTypes;
import GeneralCoreJavaProgram.ObjectsExample.CountOfProgramsInObjectsExample;
import GeneralCoreJavaProgram.UserInputPrograms.CountOfProgramsInUserInput;

public class CountOfProgramsDone {
    public static void main(String[] args) {
        CountOfProgramsInDataTypes countOfProgramsGeneralCoreJavaProgram = new CountOfProgramsInDataTypes();
        CountOfProgramsInCodingProgram countOfProgramsInCodingProgram = new CountOfProgramsInCodingProgram();
        CountOfProgramsInUserInput countOfProgramsInUserInput = new CountOfProgramsInUserInput();
        CountOfProgramsInObjectsExample countOfProgramsInObjectsExample = new CountOfProgramsInObjectsExample();
        int[] files = {countOfProgramsGeneralCoreJavaProgram.returnFileCount(), countOfProgramsInCodingProgram.returnFileCount(), countOfProgramsInUserInput.returnFileCount(), countOfProgramsInObjectsExample.returnFileCount()};
        sumOfProgramsWeDidTillNow(files);
    }

    public static void sumOfProgramsWeDidTillNow(int[] files) {
        int sum = 0;
        for (int file : files) {
            sum = sum + file;
        }
        System.out.println("Total Number of Programs Done till Now" + "::" + sum);
    }
}
