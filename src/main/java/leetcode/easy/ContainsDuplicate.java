package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by nikoo28 on 10/11/19 12:10 AM
 */

public class ContainsDuplicate {

  public boolean containsDuplicate(int[] nums) {
    Set<Integer> intSet = new HashSet<>();
    for (int num : nums) {
      if (intSet.contains(num))
        return true;
      intSet.add(num);
    }

    return false;
  }

}
