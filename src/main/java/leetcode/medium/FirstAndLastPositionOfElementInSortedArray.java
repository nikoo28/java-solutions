package leetcode.medium;

public class FirstAndLastPositionOfElementInSortedArray {

  public int[] searchRange(int[] nums, int target) {

    int left = findLeftBound(nums, target);
    int right = findRightBound(nums, target);

    return new int[]{left, right};
  }

  private int findLeftBound(int[] nums, int target) {
    int index = -1, low = 0, high = nums.length - 1;

    // Standard binary search
    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (nums[mid] == target) {
        index = mid;
        high = mid - 1; // Look in the left sub-array
      }
      else if (nums[mid] < target)
        low = mid + 1;
      else
        high = mid - 1;
    }

    return index;
  }

  private int findRightBound(int[] nums, int target) {
    int index = -1, low = 0, high = nums.length - 1;

    // Standard binary search
    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (nums[mid] == target) {
        index = mid;
        low = mid + 1; // Look in the right sub-array
      }
      else if (nums[mid] < target)
        low = mid + 1;
      else
        high = mid - 1;
    }

    return index;
  }

}
