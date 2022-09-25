package leetcode.medium;

public class HouseRobber {

  int rob(int[] nums) {

    // If only 1 element, just return it
    if (nums.length < 2)
      return nums[0];

    // Create array to store the maximum loot at each index
    int[] dp = new int[nums.length];

    // Memoize maximum loots at first 2 indexes
    dp[0] = nums[0];
    dp[1] = Math.max(nums[0], nums[1]);

    // Use them to fill complete array
    for (int i = 2; i < nums.length; i++) {

      // Core logic
      dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
    }

    return dp[nums.length - 1];
  }

}
