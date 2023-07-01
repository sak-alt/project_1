package GeneralCoreJavaProgram.Collections.Queue;

import GeneralCoreJavaProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfProgramsInQueue {
    public int returnFileCount() {
        File file = new File(PathOfProgram.getPathOfPrograms()+"\\src\\GeneralCoreJavaProgram\\Collections\\Queue\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
