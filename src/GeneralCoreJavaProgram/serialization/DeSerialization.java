package GeneralCoreJavaProgram.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee;
        FileInputStream fileInputStream = new FileInputStream("employee.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        employee = (Employee) objectInputStream.readObject();
        System.out.println(employee.id);
        System.out.println(employee.name);
        System.out.println(employee.phoneNumber);
    }
}
