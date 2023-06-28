package GeneralCoreJavaProgram.Java8Features;

import GeneralCoreJavaProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfProgramInJava8Features {
    public int returnFileCount() {
        File file = new File(PathOfProgram.getPathOfPrograms() + "\\src\\GeneralCoreJavaProgram\\Java8Features\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
