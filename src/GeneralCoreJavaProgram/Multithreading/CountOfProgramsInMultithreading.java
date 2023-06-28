package GeneralCoreJavaProgram.Multithreading;

import GeneralCoreJavaProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfProgramsInMultithreading {
    public int returnFileCount() {
        File file = new File(PathOfProgram.getPathOfPrograms() + "\\src\\GeneralCoreJavaProgram\\Multithreading\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
