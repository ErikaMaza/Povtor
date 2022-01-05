package povtor.work_with_files.programmer2;

import povtor.work_with_files.programmer1.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationExTwo {
    public static void main(String[] args) {
        Employee employee;
        try (ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("employeesTwo.bin")
        )) {
            employee = (Employee) inputStream.readObject();
            System.out.println(employee);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
