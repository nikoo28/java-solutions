package leetcode;

/**
 * @author nikoo28 on 9/16/17
 */
class MaxConsecutiveOnes {

  public int findMaxConsecutiveOnes(int[] nums) {

    int maxHere = 0, max = 0;
    for (int n : nums)
      max = Math.max(max, maxHere = n == 0 ? 0 : maxHere + 1);
    return max;
  }

}
