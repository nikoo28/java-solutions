package leetcode.easy;

/**
 * Created by nikoo28 on 12/17/17 8:54 PM
 */

class TwoSumII {

  public int[] twoSum(int[] numbers, int target) {

    int start = 0;
    int end = numbers.length - 1;

    while (start < end) {
      int sum = numbers[start] + numbers[end];
      if (sum > target)
        end--;
      if (sum < target)
        start++;
      if (sum == target)
        break;
    }

    return new int[]{start + 1, end + 1};
  }

}
