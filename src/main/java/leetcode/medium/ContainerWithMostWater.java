package leetcode.medium;

/**
 * Created by nikoo28 on 12/18/17 9:25 PM
 */

class ContainerWithMostWater {

  public int maxArea(int[] height) {

    int left = 0;
    int right = height.length - 1;
    int maxArea = 0;

    while (left < right) {

      int area =
          Math.min(height[left], height[right])
          * (right - left);

      maxArea = Math.max(area, maxArea);

      if (height[left] < height[right])
        left++;
      else
        right--;
    }

    return maxArea;
  }

}
