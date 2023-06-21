package GeneralCoreJavaProgram.serialization;

import GeneralCoreJavaProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfProgramsSerialization {
    public int returnFileCount() {
        File file = new File(PathOfProgram.getPathOfPrograms() + "\\src\\GeneralCoreJavaProgram\\serialization\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
