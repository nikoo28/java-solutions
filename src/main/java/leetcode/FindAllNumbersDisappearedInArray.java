package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nikoo28 on 9/17/17
 */
class FindAllNumbersDisappearedInArray {

  public List<Integer> findDisappearedNumbers(int[] nums) {

    List<Integer> ret = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
      int val = Math.abs(nums[i]) - 1;
      if (nums[val] > 0) {
        nums[val] = -nums[val];
      }
    }

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 0) {
        ret.add(i + 1);
      }
    }
    return ret;
  }

}
