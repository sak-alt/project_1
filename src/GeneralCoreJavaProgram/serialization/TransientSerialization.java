package GeneralCoreJavaProgram.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TransientSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee = new Employee();
        employee.id = 10;
        employee.name = "Nitesh";
        employee.phoneNumber = 1235667;
        FileOutputStream fileOutputStream = new FileOutputStream("employee.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(employee);
        System.out.println("The Serialization Is Done..!!");
    }
}
