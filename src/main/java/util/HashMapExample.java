package util;

import java.util.HashMap;

/**
 * Created by nikoo28 on 8/14/22 10:19 PM
 */

public class HashMapExample {

  public static void main(String[] args) {

    // Create a HashMap
    HashMap<String, Integer> fruitPricesMap = new HashMap<>();

    // Add values
    fruitPricesMap.put("Apple", 10);
    fruitPricesMap.put("Banana", 40);

    // Print
    System.out.println(fruitPricesMap);

    fruitPricesMap.put("Mango", 50);

    // Print
    System.out.println(fruitPricesMap);

    // Update
    fruitPricesMap.put("Apple", 15);

    // Print
    System.out.println(fruitPricesMap);

    // Remove
    fruitPricesMap.remove("Banana");

    // Print
    System.out.println(fruitPricesMap);

    // Check
    if (fruitPricesMap.containsKey("Mango"))
      System.out.println("PRESENT");
    else
      System.out.println("NOT PRESENT");
  }

}
