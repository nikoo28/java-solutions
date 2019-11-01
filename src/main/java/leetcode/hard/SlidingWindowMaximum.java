package leetcode.hard;

/**
 * Created by nikoo28 on 7/20/19 12:26 AM
 */

class SlidingWindowMaximum {

  public int[] maxSlidingWindow(int[] nums, int k) {

    int n = nums.length;
    if (n * k == 0) return new int[0];

    int[] output = new int[n - k + 1];
    for (int i = 0; i < n - k + 1; i++) {
      int max = Integer.MIN_VALUE;
      for (int j = i; j < i + k; j++)
        max = Math.max(max, nums[j]);
      output[i] = max;
    }
    return output;

  }

}
