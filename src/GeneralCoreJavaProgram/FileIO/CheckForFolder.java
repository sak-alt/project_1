package GeneralCoreJavaProgram.FileIO;

import java.io.File;
import java.io.IOException;

public class CheckForFolder {
    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\Users\\91830\\Downloads\\xyz");
        file1.mkdir();
        if (file1.isDirectory()) {
            File file = new File("C:\\Users\\91830\\Downloads\\xyz\\codetalksdna.java");
            file.createNewFile();
        } else {
            System.out.println("Folder Doesn't exist , Please Create One!");
        }
    }
}
