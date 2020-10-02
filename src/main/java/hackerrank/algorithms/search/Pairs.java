package hackerrank.algorithms.search;

import java.util.Arrays;

/**
 * Created by nikoo28 on 10/1/20 10:23 PM
 */

public class Pairs {

  private boolean binarySearch(int[] arr, int numberToFind) {
    int left = 0, right = arr.length - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (arr[mid] == numberToFind) return true;
      if (arr[mid] < numberToFind) left = mid + 1;
      else right = mid - 1;
    }
    return false;
  }

  public int pairs(int k, int[] arr) {

    // Sort the array
    Arrays.sort(arr);

    int result = 0;
    for (int i : arr) {
      int numberToSearch = i - k;
      if (binarySearch(arr, numberToSearch)) {
        result++;
      }
    }

    return result;
  }

}
