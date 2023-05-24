package GeneralCoreJavaProgram.DataTypes;

import GeneralCoreJavaProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfProgramsInDataTypes {
    public int returnFileCount() {
        File file = new File(PathOfProgram.getPathOfPrograms() + "\\src\\GeneralCoreJavaProgram\\DataTypes\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
