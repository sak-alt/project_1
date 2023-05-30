package GeneralCoreJavaProgram.abstractionExample.InterfaceExample;

import GeneralCoreJavaProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfProgramsInInterface {
    public int returnFileCount() {
        File file = new File(PathOfProgram.getPathOfPrograms() + "\\src\\GeneralCoreJavaProgram\\abstractionExample\\InterfaceExample\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
