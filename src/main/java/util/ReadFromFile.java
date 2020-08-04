package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {

  static boolean linearSearchAlgorithm1(int[] arr, int numberToFind) {

    for (int i = 0; i < arr.length; i++) {
      if (numberToFind == arr[i])
        return true;
    }

    return false;
  }

  static boolean binarySearchAlgorithm2(int[] arr, int numberToFind) {
    int left = 0, right = arr.length - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (arr[mid] == numberToFind) return true;
      if (arr[mid] < numberToFind) left = mid + 1;
      else right = mid - 1;
    }
    return false;
  }

  public static void main(String[] args) {

    int[] ints = new int[10000001]; // 10 million size
    long start, finish, timeElapsed;
    boolean result;
    int index = 0;

    // Some code to read from file into the array ints
    try {
      File myObj = new File("integers.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        ints[index++] = Integer.parseInt(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

    System.out.println("\n===== USING ALGORITHM 1 =====");
    start = System.nanoTime();
    result = linearSearchAlgorithm1(ints, 5);
    finish = System.nanoTime();
    timeElapsed = finish - start;
    System.out.print(result ? "Found" : "Not Found");
    System.out.println("\nTime Taken: " + timeElapsed + " ns");

    System.out.println("\n===== USING ALGORITHM 2 =====");
    start = System.nanoTime();
    result = binarySearchAlgorithm2(ints, 5);
    finish = System.nanoTime();
    timeElapsed = finish - start;
    System.out.print(result ? "Found" : "Not Found");
    System.out.println("\nTime Taken: " + timeElapsed + " ns");
  }

}
