package GeneralCoreJavaProgram.PolymorphismExample;

import GeneralCoreJavaProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfProgramsInPolymorphism {
    public int returnFileCount() {
        File file = new File(PathOfProgram.getPathOfPrograms() + "\\src\\GeneralCoreJavaProgram\\PolymorphismExample\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
