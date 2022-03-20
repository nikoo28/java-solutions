package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by nikoo28 on 7/20/19 1:57 PM
 */

class Subsets {

  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> resultList = new ArrayList<>();

    // Start backtracking from the beginning
    backtrack(resultList, new ArrayList<>(), nums, 0);
    return resultList;
  }

  private void backtrack(List<List<Integer>> resultSets, List<Integer> tempSet,
                         int[] nums, int start) {
    // Add the set to result set
    resultSets.add(new ArrayList<>(tempSet));
    for (int i = start; i < nums.length; i++) {

      // Case of including the number
      tempSet.add(nums[i]);

      // Backtrack the new subset
      backtrack(resultSets, tempSet, nums, i + 1);

      // Case of not-including the number
      tempSet.remove(tempSet.size() - 1);
    }
  }

}
