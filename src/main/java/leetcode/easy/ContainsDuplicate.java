package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by nikoo28 on 10/11/19 12:10 AM
 */

class ContainsDuplicate {

  public boolean containsDuplicate(int[] nums) {

    // Create hashset to store integers
    Set<Integer> intSet = new HashSet<>();

    // Iterate over each element
    for (int num : nums) {

      // Check the number in hashset
      if (intSet.contains(num))
        return true;

      // Add the number to hashset
      intSet.add(num);
    }

    return false;
  }

}
