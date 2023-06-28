package GeneralCoreJavaProgram.FileIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToFile {
    public static void main(String[] args) throws IOException {
        String[] array = {"Nitesh", "Sakhi", "Shubham"};
        File file1 = new File("C:\\Users\\91830\\Downloads\\xyz");
        file1.mkdir();
        if (file1.isDirectory()) {
            File file = new File(file1.getPath()+"\\codetalksdna.txt");
            file.createNewFile();
        } else {
            System.out.println("Folder Doesn't exist , Please Create One!");
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1.getPath()+"\\codetalksdna.txt"));
        for (String s : array) {
            bufferedWriter.write("\nWelcome to Java by" + " " + s + ".");
        }
        bufferedWriter.close();
    }
}
