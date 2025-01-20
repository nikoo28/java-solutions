package leetcode.medium;

public class FindMinimumInRotatedSortedArray {

  int findMin(int[] nums) {

    int left = 0;
    int right = nums.length - 1;

    while (left < right) {

      int mid = left + (right - left) / 2;

      // Check if the middle element is greater
      // than the right element
      if (nums[mid] > nums[right]) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }

    return nums[left];
  }

}
