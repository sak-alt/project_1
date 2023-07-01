package GeneralCoreJavaProgram.Collections.SetImpl;


import GeneralCoreJavaProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfFilesInSet {
    public int returnFileCount() {
        File file = new File(PathOfProgram.getPathOfPrograms()+"\\src\\GeneralCoreJavaProgram\\Collections\\SetImpl\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
