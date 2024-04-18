package leetcode.easy;

public class MaxConsecutiveOnes {

  int findMaxConsecutiveOnes(int[] nums) {
    int max = 0;
    int count = 0;

    // Iterate through all the elements
    // and keep a track of the maximum 1s
    for (int num : nums) {
      if (num == 1) {
        count++;
        max = Math.max(max, count);
      } else {
        count = 0;
      }
    }

    return max;
  }

}
