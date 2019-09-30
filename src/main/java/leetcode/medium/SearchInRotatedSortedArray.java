package leetcode.medium;

/**
 * Created by nikoo28 on 2019-09-14 17:38
 */

public class SearchInRotatedSortedArray {

  public int findRotationIndex(int[] nums) {

    int left = 0;
    int right = nums.length - 1;
    while (left <= right) {

      int mid = (left + right) / 2;
      if (mid == right) {
        return mid;
      }
      if (nums[mid + 1] < nums[mid])
        return mid;

      if (nums[left] <= nums[mid]) {
        left = mid + 1;
      } else
        right = mid - 1;
    }

    return -1;
  }

  public int binarySearch(int[] arr, int left, int right, int target) {

    while (left <= right) {
      int mid = (left + right) / 2;
      if (arr[mid] == target)
        return mid;

      if (arr[mid] < target) {
        left = mid + 1;
      } else
        right = mid - 1;
    }

    return -1;
  }

  public int search(int[] nums, int target) {

    int rotationIndex = findRotationIndex(nums);

    if (rotationIndex == -1 || rotationIndex == nums.length - 1)
      return binarySearch(nums, 0, nums.length - 1, target);

    if (nums[0] <= target) {
      return binarySearch(nums, 0, rotationIndex, target);
    } else
      return binarySearch(nums, rotationIndex + 1, nums.length - 1, target);
  }
}
