package leetcode;

import java.util.Arrays;

/**
 * @author nikoo28 on 9/10/17
 */
class ArrayPartition1 {

  public int arrayPairSum(int[] nums) {

    Arrays.sort(nums);

    int sum = 0;
    for (int i = 0; i < nums.length; i += 2) {
      sum += Math.min(nums[i], nums[i + 1]);
    }

    return sum;
  }

}
