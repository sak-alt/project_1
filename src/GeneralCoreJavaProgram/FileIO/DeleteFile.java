package GeneralCoreJavaProgram.FileIO;

import java.io.File;
import java.io.IOException;

public class DeleteFile {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\91830\\Downloads\\xyz\\codetalksdna.txt");
        file.delete();
    }
}
