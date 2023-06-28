package GeneralCoreJavaProgram.FileIO;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\91830\\Downloads\\xyz\\codetalksdna.txt"));
        String line;
        while (bufferedReader.readLine()!=null){
            System.out.println(bufferedReader.readLine());
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(bufferedReader.readLine());
        }
        bufferedReader.close();
    }
}
