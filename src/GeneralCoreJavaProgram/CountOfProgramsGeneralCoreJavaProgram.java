package GeneralCoreJavaProgram;

import java.io.File;

public class CountOfProgramsGeneralCoreJavaProgram {
    public int returnFileCount() {
        File file = new File("C:\\Users\\nbhushan\\Documents\\Coding-Sakhi\\project_1\\src\\GeneralCoreJavaProgram\\");
        return file.listFiles().length;
    }
}
