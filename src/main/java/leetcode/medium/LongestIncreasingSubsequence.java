package leetcode.medium;

public class LongestIncreasingSubsequence {

  int lengthOfLIS(int[] nums) {
    
    int[] T = new int[nums.length];

    // Start main pointer
    for (int i = 1; i < nums.length; i++)

      // Start second pointer
      for (int j = 0; j < i; j++)
        if (nums[i] > nums[j])
          if (T[j] + 1 > T[i])
            T[i] = T[j] + 1;

    // find the max value
    int maxIndex = 0;
    for (int i = 0; i < T.length; i++)
      if (T[i] > T[maxIndex])
        maxIndex = i;

    return T[maxIndex] + 1;
  }
}
