package povtor.work_with_files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyExTwo {
    public static void main(String[] args) {
        try (FileInputStream is = new FileInputStream(
                "D:\\Work\\files\\java.jpg");
             FileOutputStream os = new FileOutputStream(
                     "java.jpg");
        ) {
            int i;
            while ((i = is.read()) != -1) {
                os.write(i);
            }
            System.out.println("Done!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
