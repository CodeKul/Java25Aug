package filehandling;

import java.io.File;
import java.io.IOException;

public class FileMethods {
    public static void main(String[] args) {

        try {
            File file = new File("/home/vaibhav/java25aug/src/filehandling/sample1.txt");
            if (file.exists()) {
                System.out.println("file already exists");
            } else {
                file.createNewFile();
            }

            System.out.println(file.getAbsolutePath());
            System.out.println(file.getCanonicalPath());
            System.out.println(file.getPath());
            System.out.println(file.canExecute());

//            System.out.println(file.setReadOnly());
            System.out.println(file.getFreeSpace());
            System.out.println(file.getParent());
            System.out.println(file.getTotalSpace());
            System.out.println(file.isDirectory());
            System.out.println(file.isHidden());
            System.out.println(file.length());

            File file1 =new File("Test");
            file1.mkdir();

            File file2 = new File("Test/abc.txt");
            file2.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
