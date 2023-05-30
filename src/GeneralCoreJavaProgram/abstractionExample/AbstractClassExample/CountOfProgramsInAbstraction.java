package GeneralCoreJavaProgram.abstractionExample.AbstractClassExample;

import GeneralCoreJavaProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfProgramsInAbstraction {
    public int returnFileCount() {
        File file = new File(PathOfProgram.getPathOfPrograms() + "\\src\\GeneralCoreJavaProgram\\abstractionExample\\AbstractClassExample\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
