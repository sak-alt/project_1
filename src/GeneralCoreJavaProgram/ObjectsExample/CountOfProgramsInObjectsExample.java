package GeneralCoreJavaProgram.ObjectsExample;

import GeneralCoreJavaProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfProgramsInObjectsExample {
    public int returnFileCount() {
        File file = new File(PathOfProgram.getPathOfPrograms() + "\\src\\GeneralCoreJavaProgram\\ObjectsExample\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
