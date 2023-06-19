package GeneralCoreJavaProgram.ExceptionHandling;

import GeneralCoreJavaProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfProgramsInExceptionPackage {
    public int returnFileCount() {
        File file = new File(PathOfProgram.getPathOfPrograms() + "\\src\\GeneralCoreJavaProgram\\ExceptionHandling\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
