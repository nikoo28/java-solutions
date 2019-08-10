package leetcode;

/**
 * Created by nikoo28 on 7/12/19 1:23 AM
 */

public class ProductOfArrayExceptSelf {

  public int[] productExceptSelf(int[] nums) {

    if (nums.length < 2)
      return nums;

    int[] leftToRight = new int[nums.length];
    int[] rightToLeft = new int[nums.length];

    leftToRight[0] = 1;
    for (int i = 1; i < nums.length; i++) {
      leftToRight[i] = leftToRight[i - 1] * nums[i - 1];
    }

    rightToLeft[nums.length - 1] = 1;
    for (int i = nums.length - 2; i > -1; i--) {
      rightToLeft[i] = rightToLeft[i + 1] * nums[i + 1];
    }

    int[] ans = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      ans[i] = leftToRight[i] * rightToLeft[i];
    }

    return ans;

  }

}
