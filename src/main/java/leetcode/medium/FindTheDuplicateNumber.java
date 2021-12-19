package leetcode.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumber {

  public int findDuplicate(int[] nums) {

    // Start a fast and slow pointer
    // until they meet
    int slow = 0, fast = 0;
    do {
      slow = nums[slow];
      fast = nums[nums[fast]];
    } while (slow != fast);

    // As soon as they meet, move both
    // pointers at same speed until they
    // meet again
    slow = 0;
    while (slow != fast) {
      slow = nums[slow];
      fast = nums[fast];
    }
    return slow;
  }

  public int findDuplicatesSorting(int[] nums) {
    Arrays.sort(nums);

    int prev = -1;
    for (int num : nums) {
      if (num == prev)
        break;
      prev = num;
    }

    return prev;
  }

  public int findDuplicatesHashSet(int[] nums) {
    Set<Integer> numSet = new HashSet<>();

    for (int num : nums) {
      if (numSet.contains(num))
        return num;
      numSet.add(num);
    }

    return -1;
  }
}
