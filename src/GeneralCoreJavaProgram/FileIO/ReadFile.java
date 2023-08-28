package GeneralCoreJavaProgram.FileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\91830\\Downloads\\xyz\\codetalksdna.txt"));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println("The Data in the files are: " + line);
        }
        bufferedReader.close();
    }
}
