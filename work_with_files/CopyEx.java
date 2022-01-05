package povtor.work_with_files;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(
                new FileReader("test.txt"));
             BufferedWriter writer = new BufferedWriter(
                     new FileWriter("textOne.txt"));
        ) {
//            int character;
//            while ((character = reader.read()) != -1) {
//                writer.write(character);
//            }
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.write('\n');
            }
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

