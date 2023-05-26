package GeneralCoreJavaProgram.UserInputPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Enter value1 ?");
        int value1 = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter value2 ?");
        int value2 = Integer.parseInt(bufferedReader.readLine());

        int sum = value1 + value2;
        System.out.println("Sum of two number is::" + " " + sum);
    }
}
