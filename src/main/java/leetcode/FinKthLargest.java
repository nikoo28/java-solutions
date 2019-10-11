package leetcode;

import java.util.Arrays;

/**
 * Created by nikoo28 on 7/18/19 2:32 AM
 */

class FinKthLargest {

  public int fingKthLargest(int[] nums, int k) {
    final int N = nums.length;
    Arrays.sort(nums);
    return nums[N - k];
  }

}
