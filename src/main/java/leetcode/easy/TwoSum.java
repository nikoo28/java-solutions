package leetcode.easy;

import java.util.*;

/**
 * Created by nikoo28 on 7/4/19 2:50 PM
 */

class TwoSum {

  int[] twoSum(int[] nums, int target) {

    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement)) {
        return new int[]{map.get(complement), i};
      }
      map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
  }

}
