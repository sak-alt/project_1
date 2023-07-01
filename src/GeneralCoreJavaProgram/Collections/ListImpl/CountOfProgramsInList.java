package GeneralCoreJavaProgram.Collections.ListImpl;

import GeneralCoreJavaProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfProgramsInList {
    public int returnFileCount() {
        File file = new File(PathOfProgram.getPathOfPrograms()+"\\src\\GeneralCoreJavaProgram\\Collections\\ListImpl\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
