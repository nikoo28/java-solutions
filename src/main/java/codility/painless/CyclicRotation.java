package codility.painless;

/**
 * Created by nikoo28 on 2019-08-25 20:03
 */

class CyclicRotation {

  public int[] solution(int[] nums, int k) {
    // write your code in Java SE 8

    if (nums.length == 0)
      return nums;

    k %= nums.length;
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);

    return nums;
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
