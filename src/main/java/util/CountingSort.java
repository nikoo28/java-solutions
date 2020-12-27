package util;

import java.util.Arrays;

/**
 * Created by nikoo28 on 12/26/20 8:16 PM
 */

public class CountingSort {

  static void countingSort(int[] arr)
  {
    int max = Arrays.stream(arr).max().getAsInt();
    int min = Arrays.stream(arr).min().getAsInt();
    int range = max - min + 1;

    // Auxiliary array to store counts of each element
    int[] count = new int[range];

    // Auxiliary array to store the resultant sorted array
    int[] output = new int[arr.length];

    // Store count of each element
    for (int j : arr) {
      count[j - min]++;
    }

    // Change count[i] so that count[i] now contains actual
    // position of this character in output array
    for (int i = 1; i < count.length; i++) {
      count[i] += count[i - 1];
    }

    // Build the output character array
    // To make it stable we are operating in reverse order.
    for (int i = arr.length - 1; i >= 0; i--) {
      output[count[arr[i] - min] - 1] = arr[i];
      count[arr[i] - min]--;
    }

    System.arraycopy(output, 0, arr, 0, arr.length);
  }

}
