package leetcode.easy;

public class LeftAndRightSumDifferences {

  int[] leftRightDifference(int[] nums) {

    int rightSum = 0;
    int leftSum = 0;

    // Calculate the total right sum
    for (int num : nums) {
      rightSum += num;
    }

    // Iterate through the array
    for (int i = 0; i < nums.length; i++) {
      // Get the value at index i
      int val = nums[i];

      // Update the right sum
      rightSum -= val;

      // Find the difference
      nums[i] = Math.abs(leftSum - rightSum);

      // Update the left sum
      leftSum += val;
    }

    return nums;
  }

}
