package povtor.work_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAndFilesEx2 {
    public static void main(String[] args) throws IOException {

        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("D:\\Work\\files\\A");
        Path directoryBPath = Paths.get("D:\\Work\\files\\B");

    //    Files.copy(filePath, directoryPath.resolve(filePath));
       // Files.copy(filePath, directoryPath.resolve(filePath),
         //       StandardCopyOption.REPLACE_EXISTING);
      //  Files.copy(filePath, directoryPath.resolve("text16.txt"));
     //   Files.copy(directoryBPath, directoryPath.resolve("B"));

       //Files.move(filePath, directoryPath.resolve("text15.txt"));

       // Files.move(Paths.get("test10.txt"), (Paths.get("test11.txt")));

       // Files.delete(Paths.get("test5.txt"));
        Files.delete(directoryBPath);

        System.out.println("Done!");

    }
}