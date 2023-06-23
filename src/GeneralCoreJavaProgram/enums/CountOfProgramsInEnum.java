package GeneralCoreJavaProgram.enums;

import GeneralCoreJavaProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfProgramsInEnum {
    public int returnFileCount() {
        File file = new File(PathOfProgram.getPathOfPrograms() + "\\src\\GeneralCoreJavaProgram\\enums\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
