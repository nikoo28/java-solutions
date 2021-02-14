package hackerrank.algorithms.dynamicprogramming;

import java.util.Arrays;

/**
 * Created by nikoo28 on 2/14/21 12:48 AM
 */

public class Equal {

  int equal(int[] arr) {

    // Store all the possibilities
    int[] possibilities = new int[5];

    // Start with the minimum element
    int minimum = Arrays.stream(arr).min().getAsInt();

    for (int i = 0; i < possibilities.length; i++) {

      for (int k : arr) {
        int diff = k - minimum;
        int stepsRequired = diff / 5 + (diff % 5) / 2 + ((diff % 5) % 2) / 1;
        possibilities[i] += stepsRequired;
      }
      minimum--;
    }

    // Return the minimum number out of all the possibilities
    return Arrays.stream(possibilities).min().getAsInt();
  }

}
