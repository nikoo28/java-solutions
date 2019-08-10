package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by nikoo28 on 7/20/19 1:57 PM
 */

public class Subsets {

  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    backtrack(list, new ArrayList<Integer>(), nums, 0);
    return list;
  }

  private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start) {
    list.add(new ArrayList<>(tempList));
    for (int i = start; i < nums.length; i++) {
      tempList.add(nums[i]);
      backtrack(list, tempList, nums, i + 1);
      tempList.remove(tempList.size() - 1);
    }
  }

}
