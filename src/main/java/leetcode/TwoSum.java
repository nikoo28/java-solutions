package leetcode;

import java.util.*;

/**
 * Created by nikoo28 on 7/4/19 2:50 PM
 */

public class TwoSum {

  public int[] twoSum(int[] nums, int target) {

    Map<Integer, Integer> numIndexMap = new HashMap<>();

    int idx = 0;
    for (int num : nums)
      numIndexMap.put(idx++, num);

    for (int i = 0; i < nums.length; i++) {
      numIndexMap.remove(i);
      if (numIndexMap.containsValue(target - nums[i])) {
        int[] a = new int[2];
        a[0] = i;
        for (int j = 0; j < nums.length; j++) {
          if (j == i)
            continue;

          if (nums[j] + nums[i] == target) {
            a[1] = j;
            return a;
          }
        }
      }
      numIndexMap.put(i, nums[i]);
    }

    return null;
  }

}
