package GeneralCoreJavaProgram.Collections.Map;

import GeneralCoreJavaProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfProgramsInMap {
    public int returnFileCount() {
        File file = new File(PathOfProgram.getPathOfPrograms()+"\\src\\GeneralCoreJavaProgram\\Collections\\Map\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
