package GeneralCoreJavaProgram.serialization;

import java.io.*;

public class Serialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee = new Employee();
        employee.id = 10;
        employee.name = "Nitesh";
        employee.phoneNumber = 1235667;

        FileOutputStream fileOutputStream = new FileOutputStream("employee.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(employee);
    }
}
