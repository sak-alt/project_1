package GeneralCoreJavaProgram.FileIO;

import GeneralCoreJavaProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfProgramsInFileIO {
    public int returnFileCount() {
        File file = new File(PathOfProgram.getPathOfPrograms() + "\\src\\GeneralCoreJavaProgram\\FileIO\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
