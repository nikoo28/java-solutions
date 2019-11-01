package leetcode.hard;

/**
 * Created by nikoo28 on 7/8/19 12:56 AM
 */

class TrappingRainWater {

  public int trap(int[] height) {

    if (height.length == 0)
      return 0;
    int totalWater = 0;

    int[] leftMax = new int[height.length];
    int[] rightMax = new int[height.length];

    int max = height[0];
    leftMax[0] = max;
    for (int i = 1; i < height.length; i++) {
      if (height[i] > max) {
        max = height[i];
      }
      leftMax[i] = max;
    }

    max = height[height.length - 1];
    rightMax[height.length - 1] = max;
    for (int i = height.length - 2; i > -1 ; i--) {
      if (height[i] > max) max = height[i];

      rightMax[i] = max;
    }

    for (int i = 0; i < height.length; i++) {
      totalWater += Math.min(leftMax[i], rightMax[i]) - height[i];
    }

    return totalWater;
  }
}
