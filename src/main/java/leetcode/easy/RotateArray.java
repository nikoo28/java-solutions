package leetcode.easy;

/**
 * Created by nikoo28 on 2019-07-21 14:59
 */

class RotateArray {

  public void rotate(int[] nums, int k) {

    if (nums.length == 0)
      return;

    k %= nums.length;
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);
  }

  private void reverse(int[] nums, int start, int end) {
    while (start < end) {
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
      start++;
      end--;
    }
  }

}
