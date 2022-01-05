package povtor.important.scanners;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ScannerTwo {
    public static void main(String[] args) {
        Scanner sc = null;
        Set<String> set = new TreeSet<>();
        try {
            sc = new Scanner(new FileReader(
                    new File("C:\\Users\\admin\\Desktop\\test.txt")));
            sc.useDelimiter("\\W");
            while (sc.hasNext()) {
                String word = sc.next();
                set.add(word);
            }
            for (String word : set) {
                System.out.println(word);
            }
        } catch (FileNotFoundException e) {
            System.out.println("We have a problem");
        } finally {
            sc.close();
        }
    }
}
