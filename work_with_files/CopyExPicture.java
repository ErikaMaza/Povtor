package povtor.work_with_files;

import java.io.*;

public class CopyExPicture {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(
                new FileReader("D:\\Work\\files\\java.jpg"));
             BufferedWriter writer = new BufferedWriter(
                     new FileWriter("java.jpg"));
        ) {
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
//            String line;
//            while ((line = reader.readLine()) != null) {
//                writer.write(line);
//                writer.write('\n');
//            }
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
// так работает с ошибками
