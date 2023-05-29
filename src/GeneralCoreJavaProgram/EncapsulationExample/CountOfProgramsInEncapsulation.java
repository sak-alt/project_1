package GeneralCoreJavaProgram.EncapsulationExample;

import GeneralCoreJavaProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfProgramsInEncapsulation {
    public int returnFileCount() {
        File file = new File(PathOfProgram.getPathOfPrograms() + "\\src\\GeneralCoreJavaProgram\\EncapsulationExample\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
