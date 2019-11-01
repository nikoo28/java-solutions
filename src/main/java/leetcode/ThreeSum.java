package leetcode;

import java.util.*;

/**
 * Created by nikoo28 on 7/9/19 1:18 AM
 */

class ThreeSum {

  public List<List<Integer>> threeSum(int[] nums) {

    Arrays.sort(nums);

    Set<List<Integer>> solution = new HashSet<>();

    for (int i = 0; i < nums.length; i++) {

      findSum(nums, 0 - nums[i], i, solution);
    }

    return new ArrayList<>(solution);
  }

  private void findSum(int[] arr, int sum, int ignore, Set<List<Integer>> solution) {

    int i = 0;
    int end = arr.length - 1;

    while (i < end) {
      if (i == ignore) {
        i++;
        continue;
      }

      if (end == ignore) {
        end--;
        continue;
      }

      if (arr[i] + arr[end] == sum) {
        List<Integer> set = new ArrayList<>();
        set.add(arr[ignore]);
        set.add(arr[i]);
        set.add(arr[end]);
        Collections.sort(set);
        solution.add(set);
      }

      if (arr[i] + arr[end] > sum) {
        end--;
        continue;
      }

      i++;
    }
  }
}
