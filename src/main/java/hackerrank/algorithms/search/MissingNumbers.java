package hackerrank.algorithms.search;

import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by nikoo28 on 9/25/20 6:08 PM
 */

public class MissingNumbers {

  public int[] missingNumbers(int[] arr, int[] brr) {

    TreeMap<Integer, Integer> integerFreqMap = new TreeMap<>();

    // Add elements of original list
    for (int i : brr) {
      int freq = integerFreqMap.getOrDefault(i, 0);
      freq++;
      integerFreqMap.put(i, freq);
    }

    // Remove elements of new list
    for (int i : arr) {
      int freq = integerFreqMap.get(i);
      freq--;
      if (freq == 0)
        integerFreqMap.remove(i);
      else
        integerFreqMap.put(i, freq);
    }

    // Create the result array
    int[] result = new int[integerFreqMap.size()];
    int i = 0;
    for (Map.Entry<Integer, Integer> integerIntegerEntry : integerFreqMap.entrySet()) {
      result[i++] = integerIntegerEntry.getKey();
    }

    return result;
  }

}
