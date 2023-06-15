package GeneralCoreJavaProgram.Arrays;

import GeneralCoreJavaProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfProgramsInArrays {
    public int returnFileCount() {

        File file = new File(PathOfProgram.getPathOfPrograms() + "\\src\\GeneralCoreJavaProgram\\Arrays\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
