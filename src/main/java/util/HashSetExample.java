package util;

import java.util.HashSet;

/**
 * Created by nikoo28 on 8/6/22 2:14 PM
 */

public class HashSetExample {

  public static void main(String[] args) {

    // Creating a hashset
    HashSet<Integer> myHashSet = new HashSet<>();

    // Add some integers
    myHashSet.add(4);
    myHashSet.add(8);
    myHashSet.add(15);
    myHashSet.add(16);

    // Print
    System.out.println(myHashSet);

    // Check if 4 is present
    if(myHashSet.contains(4))
      System.out.println("PRESENT");
    else
      System.out.println("NOT PRESENT");

    // Check if 100 is present
    if(myHashSet.contains(100))
      System.out.println("PRESENT");
    else
      System.out.println("NOT PRESENT");

    // Delete element
    myHashSet.remove(8);

    // Print again
    System.out.println(myHashSet);
  }

}
