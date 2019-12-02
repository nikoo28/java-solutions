package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 11/2/19 11:13 PM
 */

class TwoSumTest {

  private TwoSum twoSum = new TwoSum();

  @Test
  void twoSum() {
    int[] nums = {2, 7, 11, 15};
    int target = 9;

    int[] res = twoSum.twoSum(nums, target);
    assertEquals(9, nums[res[0]] + nums[res[1]]);
  }
}