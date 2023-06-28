package GeneralCoreJavaProgram.Collections;

import GeneralCoreJavaProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfProgramsInCollections {
    public int returnFileCount() {
        File file = new File(PathOfProgram.getPathOfPrograms() + "\\src\\GeneralCoreJavaProgram\\Collections\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
