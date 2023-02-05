package leetcode.medium;

/**
 * Created by nikoo28 on 12/19/17 1:12 AM
 */

class SortColors {

  void sortColors(int[] nums) {

    int start = 0;
    int mid = 0;
    int end = nums.length - 1;

    while (mid <= end) {

      switch (nums[mid]) {
        case 0:
          // Swap with start index
          swap(nums, start, mid);
          mid++;
          start++;
          break;

        case 1:
          mid++;
          break;

        case 2:
          // Swap with end index
          swap(nums, mid, end);
          end--;
          break;
      }
    }

  }

  private void swap(int[] arr, int pos1, int pos2) {
    int temp = arr[pos1];
    arr[pos1] = arr[pos2];
    arr[pos2] = temp;
  }

}
