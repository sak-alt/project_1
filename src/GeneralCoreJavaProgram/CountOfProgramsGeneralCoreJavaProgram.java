package GeneralCoreJavaProgram;

import java.io.File;
import java.util.Objects;

public class CountOfProgramsGeneralCoreJavaProgram {
    public int returnFileCount() {
//        String path = "C:\\Users\\Sakhi Chaudhary\\IdeaProjects\\project_1";
        String path = "D:\\Intellij-Idea-Projects\\project_1";
        File file = new File(path + "\\src\\GeneralCoreJavaProgram\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
