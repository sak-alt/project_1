package GeneralCoreJavaProgram.UserInputPrograms;

import GeneralCoreJavaProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfProgramsInUserInput {
    public int returnFileCount() {
        File file = new File(PathOfProgram.getPathOfPrograms() + "\\src\\GeneralCoreJavaProgram\\UserInputPrograms\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
