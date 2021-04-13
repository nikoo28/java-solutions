package hackerrank.datastructures.arrays;

/**
 * Created by nikoo28 on 9/2/20 12:05 AM
 */

public class LeftRotation {

  // Helper function to reverse an array from start index to end index
  public void reverse(int[] nums, int start, int end) {
    while (start < end) {
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
      start++;
      end--;
    }
  }

  public void rotateLeftUsingReverse(int[] arr, int k) {
    k %= arr.length;

    // Reverse all numbers
    reverse(arr, 0, arr.length - 1);

    // Reverse first arr.length-k numbers
    reverse(arr, 0, arr.length - k - 1);

    // Reverse last k numbers
    reverse(arr, arr.length - k, arr.length - 1);
  }

  public void rotateLeftUsingBruteForce(int[] arr, int k) {
    k %= arr.length;

    // Rotate the array k times
    for (int i = 0; i < k; i++) {
      int j, temp;
      temp = arr[0];
      // Perform rotation for each iteration
      for (j = 0; j < arr.length - 1; j++)
        arr[j] = arr[j + 1];
      arr[j] = temp;
    }
  }

  public void rotateLeft(int[] arr, int k) {
    k %= arr.length;
    int[] temp = new int[k];

    // Store the first k elements in a temp array
    for (int i = 0; i < temp.length; i++) {
      temp[i] = arr[i];
    }

    // Shift rest of the arr[]
    for (int i = 0; i < arr.length - k; i++) {
      arr[i] = arr[i + k];
    }

    // Store back the k elements
    int idx = 0;
    for (int i = arr.length - k; i < arr.length; i++) {
      arr[i] = temp[idx++];
    }
  }
}
