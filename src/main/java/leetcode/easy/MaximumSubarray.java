package leetcode.easy;

/**
 * Created by nikoo28 on 2019-10-05 18:20
 */

class MaximumSubarray {

  public int maxSubArray(int[] nums) {

    int max_so_far = nums[0];
    int curr_max = nums[0];

    for (int i = 1; i < nums.length; i++) {
      curr_max = Math.max(nums[i], nums[i] + curr_max);
      max_so_far = Math.max(curr_max, max_so_far);
    }

    return max_so_far;
  }

}
