package GeneralCoreJavaProgram.FileIO;

import java.io.File;
import java.io.IOException;

public class CreateAFile {
    public static void main(String[] args) throws IOException {
        File file = new File("output.txt");
        file.createNewFile();
    }
}
