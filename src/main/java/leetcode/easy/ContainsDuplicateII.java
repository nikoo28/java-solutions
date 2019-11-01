package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by nikoo28 on 10/11/19 12:31 AM
 */

class ContainsDuplicateII {

  boolean containsNearbyDuplicate(int[] nums, int k) {
    Set<Integer> set = new HashSet<>();

    for (int i = 0; i < nums.length; i++) {
      if (i > k)
        set.remove(nums[i - k - 1]);
      if (!set.add(nums[i]))
        return true;
    }
    return false;
  }

}
