package leetcode.easy;

public class FindPivotIndex {

  int pivotIndex(int[] nums) {

    // Calculate the sum of the array
    int rightSum = 0;
    for (int num : nums) {
      rightSum += num;
    }

    int leftSum = 0;

    // Iterate through the array
    for (int i = 0; i < nums.length; i++) {

      // Update the right sum
      rightSum -= nums[i];

      // Check if the left sum is equal to the right sum
      if (leftSum == rightSum) {
        return i;
      }

      // Update the left sum
      leftSum += nums[i];
    }

    // Return -1 if no pivot index is found
    return -1;
  }

}
