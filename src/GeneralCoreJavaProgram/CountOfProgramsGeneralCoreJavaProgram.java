package GeneralCoreJavaProgram;

import java.io.File;

public class CountOfProgramsGeneralCoreJavaProgram {
    public int returnFileCount() {
        String sakhiPath = "C:\\Users\\Sakhi Chaudhary\\IdeaProjects\\project_1";
        String niteshPath = "C:\\Users\\Sakhi Chaudhary\\IdeaProjects\\project_1";
        File file = new File(sakhiPath + "\\src\\GeneralCoreJavaProgram\\");
        return file.listFiles().length;
    }
}
