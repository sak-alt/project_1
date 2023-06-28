package GeneralCoreJavaProgram.FileIO;

import java.io.File;
import java.io.IOException;

public class CreateAFolder {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\91830\\Downloads\\java");
        file.mkdir();
        File file1 = new File("C:\\Users\\91830\\Downloads\\java\\codetalksdna.java");
        file1.createNewFile();
    }
}
