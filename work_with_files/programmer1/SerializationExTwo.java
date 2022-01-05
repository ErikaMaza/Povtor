package povtor.work_with_files.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExTwo {
    public static void main(String[] args) {
        Car car = new Car("BMW", "black");
        Employee employee = new Employee("Erika", "Eger", "IT", //28,
               500, car);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("employeesTwo.bin")
        )) {
            outputStream.writeObject(employee);
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
