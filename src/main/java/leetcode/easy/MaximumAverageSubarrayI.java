package leetcode.easy;

public class MaximumAverageSubarrayI {

  double findMaxAverage(int[] nums, int k) {

    // Get sum for starting window
    int sum = 0;
    for (int i = 0; i < k; i++)
      sum += nums[i];

    int maxSum = sum;

    // Start sliding window
    int startIndex = 0;
    int endIndex = k;
    while (endIndex < nums.length) {

      sum -= nums[startIndex]; // Remove previous element
      startIndex++;

      sum += nums[endIndex]; // Add next element
      endIndex++;

      maxSum = Math.max(maxSum, sum); // Update max sum
    }

    // Return the average
    return (double) maxSum / k;
  }
}
