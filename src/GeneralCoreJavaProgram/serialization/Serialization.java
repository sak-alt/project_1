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


        FileInputStream fileInputStream = new FileInputStream("employee.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        employee = (Employee) objectInputStream.readObject();
        System.out.println(employee.id);
        System.out.println(employee.name);
        System.out.println(employee.phoneNumber);
    }
}
