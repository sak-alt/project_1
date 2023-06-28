package GeneralCoreJavaProgram.FileIO;

import java.io.File;
import java.io.IOException;

public class DeleteFile {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\91830\\Downloads\\xyz\\codetalksdna.txt");
        boolean deleted = file.delete();
        if(deleted){
            System.out.println("The file is deleted");
        }else{
            System.out.println("something went wrong!!");
        }
    }
}
