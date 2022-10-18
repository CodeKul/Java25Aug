package filehandling;

import java.io.*;
import java.util.Scanner;

public class BufferDemo {
    public static void main(String[] args) {
        File file = new File("text2.txt");
        Scanner scanner = new Scanner(System.in);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);

            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            System.out.println("Enter values");
            String str = scanner.next();
            byte[] arr = str.getBytes();
            bufferedOutputStream.write(arr);
            System.out.println("file write successfully");
            bufferedOutputStream.close();
            fileOutputStream.close();
        } catch (IOException f){
            System.out.println(f.getMessage());
        }

        try {
            FileInputStream fileInputStream = new FileInputStream(file);

            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            for(int i = bufferedInputStream.read();i>= 0;){
                System.out.print((char)i);
                i = bufferedInputStream.read();
            }
            bufferedInputStream.close();
            fileInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
