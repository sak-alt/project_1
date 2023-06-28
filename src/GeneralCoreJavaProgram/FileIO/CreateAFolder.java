package GeneralCoreJavaProgram.FileIO;

import java.io.File;
import java.io.IOException;

public class CreateAFolder {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\91830\\Downloads\\java");
        file.mkdir();
        System.out.println(file.getPath());
        File file1 = new File(file.getPath() + "\\codetalksdna.java");
        boolean fileCreation = file1.createNewFile();
        if (fileCreation) {
            System.out.println("File has been Created");
        } else {
            System.out.println("Something went wrong");
        }
    }
}
