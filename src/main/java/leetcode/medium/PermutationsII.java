package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII {

  public List<List<Integer>> permuteUnique(int[] nums) {

    List<List<Integer>> resultList = new ArrayList<>();
    Arrays.sort(nums);

    backtrack(resultList, new ArrayList<>(), nums, new boolean[nums.length]);
    return resultList;
  }

  private void backtrack(List<List<Integer>> resultList,
                         ArrayList<Integer> tempList, int[] nums, boolean[] used) {
    // If we match the length, it is a permutation
    if (tempList.size() == nums.length
        && !resultList.contains(tempList)) {
      resultList.add(new ArrayList<>(tempList));
      return;
    }

    for (int i = 0; i < nums.length; i++) {
      // Skip if we get same element
      if (used[i]) continue;

      // Add the new element and mark it as used
      used[i] = true;
      tempList.add(nums[i]);

      // Go back to try other element
      backtrack(resultList, tempList, nums, used);

      // Remove the element and mark it as unused
      used[i] = false;
      tempList.remove(tempList.size() - 1);
    }
  }

}
