package filehandling;

import java.io.*;

public class FileHandlingDemo {
    public static void main(String[] args)  {

        File file = new File("text.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            String str = "Welcome ";
            byte[] arr = str.getBytes();
            fileOutputStream.write(arr);
            System.out.println("file write successfully");
        } catch (IOException f){
            System.out.println(f.getMessage());
        }

        try {
            FileInputStream fileInputStream = new FileInputStream(file);

            for(int i = fileInputStream.read();i>= 0;){
                System.out.print((char)i);
                i = fileInputStream.read();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
