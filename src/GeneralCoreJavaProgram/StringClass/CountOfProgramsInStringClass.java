package GeneralCoreJavaProgram.StringClass;

import GeneralCoreJavaProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfProgramsInStringClass {
    public int returnFileCount() {
        File file = new File(PathOfProgram.getPathOfPrograms() + "\\src\\GeneralCoreJavaProgram\\StringClass\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
