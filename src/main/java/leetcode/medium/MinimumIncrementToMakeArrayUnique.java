package leetcode.medium;

import java.util.Arrays;

public class MinimumIncrementToMakeArrayUnique {

  int minIncrementForUnique(int[] nums) {

    Arrays.sort(nums);

    int moves = 0;

    // Iterate through the array
    for (int i = 1; i < nums.length; i++) {

      // If the current element is
      // less than or equal to the previous element
      if (nums[i] <= nums[i - 1]) {

        // Increment the moves by the difference
        moves += nums[i - 1] - nums[i] + 1;
        nums[i] = nums[i - 1] + 1;
      }
    }

    return moves;
  }

}
