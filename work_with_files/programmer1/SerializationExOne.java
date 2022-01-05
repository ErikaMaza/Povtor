package povtor.work_with_files.programmer1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializationExOne {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("Erika");
        employees.add("Yulia");
        employees.add("Igor");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("employeesOne.bin")
        )) {
            outputStream.writeObject(employees);
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
