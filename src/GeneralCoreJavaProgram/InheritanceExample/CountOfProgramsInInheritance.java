package GeneralCoreJavaProgram.InheritanceExample;

import GeneralCoreJavaProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfProgramsInInheritance {
    public int returnFileCount() {
        File file = new File(PathOfProgram.getPathOfPrograms() + "\\src\\GeneralCoreJavaProgram\\InheritanceExample\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
