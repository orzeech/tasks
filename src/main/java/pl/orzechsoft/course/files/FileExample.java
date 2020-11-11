package pl.orzechsoft.course.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileExample {

  public static void main(String[] args) {
    String content = null;
    try {
      content = Files.readString(Path.of("whatever.txt"));
    } catch (IOException e) {
      System.err.println(e.getMessage());
    }
    System.out.println(content);

    // Klasyczna metoda czytania linijka po linijce
    FileReader fileReader = null;
    BufferedReader bufferedReader = null;
    try {
      fileReader = new FileReader("whatever.txt");
      bufferedReader = new BufferedReader(fileReader);

      String line = bufferedReader.readLine();
      while (line != null) {
        System.out.println(line);
        line = bufferedReader.readLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (bufferedReader != null) {
        try {
          bufferedReader.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      if (fileReader != null) {
        try {
          fileReader.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }

    // try-with-resources
    try (FileReader fr = new FileReader("whatever.txt");
        BufferedReader br = new BufferedReader(fr)) {
      String line = br.readLine();
      while (line != null) {
        System.out.println(line);
        line = br.readLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
