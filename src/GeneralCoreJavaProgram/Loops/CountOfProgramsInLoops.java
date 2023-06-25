package GeneralCoreJavaProgram.Loops;

import GeneralCoreJavaProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfProgramsInLoops {
    public int returnFileCount() {
        File file = new File(PathOfProgram.getPathOfPrograms() + "\\src\\GeneralCoreJavaProgram\\Loops\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
