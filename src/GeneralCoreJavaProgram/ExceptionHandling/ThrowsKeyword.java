package GeneralCoreJavaProgram.ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class ThrowsKeyword {
    public static void main(String[] args) throws FileNotFoundException , SQLException {
        File file = new File("D:\\Exception\\nitesh.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
    }
}

