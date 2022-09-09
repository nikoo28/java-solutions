package leetcode.medium;

/**
 * Created by nikoo28 on 7/12/19 1:23 AM
 */

class ProductOfArrayExceptSelf {

  public int[] productExceptSelf(int[] nums) {

    // Array to store all left multiplication
    int[] left = new int[nums.length];

    // Array to store all right multiplication
    int[] right = new int[nums.length];

    left[0] = 1;
    for (int i = 1; i < nums.length; i++) {
      left[i] = left[i - 1] * nums[i - 1];
    }

    right[nums.length - 1] = 1;
    for (int i = nums.length - 2; i > -1; i--) {
      right[i] = right[i + 1] * nums[i + 1];
    }

    int[] ans = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      ans[i] = left[i] * right[i];
    }

    return ans;
  }

}
