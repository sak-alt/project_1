import GeneralCoreJavaProgram.CountOfProgramsGeneralCoreJavaProgram;

public class CountOfProgramsDone {
    public static void main(String[] args) {
        CountOfProgramsGeneralCoreJavaProgram countOfProgramsGeneralCoreJavaProgram = new CountOfProgramsGeneralCoreJavaProgram();
        int[] files = {countOfProgramsGeneralCoreJavaProgram.returnFileCount()};
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
