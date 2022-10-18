package filehandling;

import java.io.*;

public class FileWriterDemo {

    public static void main(String[] args) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {

            fileWriter = new FileWriter("src/filehandling/sample.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("India is my country");
            System.out.println("file write successfully");

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                fileWriter.close();
                bufferedWriter.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("src/filehandling/sample.txt");
            bufferedReader = new BufferedReader(fileReader);
            for(int i = bufferedReader.read();i>= 0;){
                System.out.print((char)i);
                i = bufferedReader.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
