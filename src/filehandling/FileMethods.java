package filehandling;

import java.io.File;
import java.io.IOException;

public class FileMethods {
    public static void main(String[] args) {

        try {
            File file = new File("sample1.txt");
            if (file.exists()) {
                System.out.println("file already exists");
            } else {
                file.createNewFile();
            }

            System.out.println(file.getAbsolutePath());
            System.out.println(file.getCanonicalPath());
            System.out.println(file.getPath());
            System.out.println(file.canExecute());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
