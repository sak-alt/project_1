package GeneralCoreJavaProgram.CodingPractice;

import GeneralCoreJavaProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfProgramsInCodingPractice {
    public int returnFileCount() {

        File file = new File(PathOfProgram.getPathOfPrograms() + "\\src\\GeneralCoreJavaProgram\\CodingPractice\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
