package util;

import java.io.FileWriter;
import java.io.IOException;

public class GenerateIntegers {

  public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("integers.txt");

      for (int i = 0; i < 10000000; i++) {
        myWriter.write(i + "\n");
      }

      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }

}
