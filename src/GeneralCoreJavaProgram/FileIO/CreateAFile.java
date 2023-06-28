package GeneralCoreJavaProgram.FileIO;

import java.io.File;
import java.io.IOException;

public class CreateAFile {
    public static void main(String[] args) throws IOException {
        File file = new File("output.txt");
       boolean fileCreated = file.createNewFile();
       if(fileCreated){
           System.out.println("File Created");
       }else{
           System.out.println("Something went wrong!!");
       }
    }
}
