package leetcode.easy;

public class KthMissingPositiveNumber {

  // Implementation using binary search with proper comments
  int findKthPositive(int[] arr, int k) {
    // Initialize the left and right pointers
    int left = 0;
    int right = arr.length;

    // Start a loop and keep moving till left is less than right
    while (left < right) {
      // Calculate the mid
      int mid = left + (right - left) / 2;

      // If the number of missing elements is less than k
      if (arr[mid] - mid - 1 < k) {
        // Move left to mid + 1
        left = mid + 1;
      } else {
        // Move right to mid
        right = mid;
      }
    }

    // Return the kth missing element
    return left + k;
  }

}
