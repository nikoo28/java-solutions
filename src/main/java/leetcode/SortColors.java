package leetcode;

/**
 * Created by nikoo28 on 12/19/17 1:12 AM
 */

class SortColors {

  public void sortColors(int[] nums) {

    int start = 0;
    int mid = 0;
    int end = nums.length - 1;

    int temp;
    while (mid <= end) {

      switch (nums[mid]) {
        case 0:
          temp = nums[start];
          nums[start] = nums[mid];
          nums[mid] = temp;
          mid++;
          start++;
          break;

        case 1:
          mid++;
          break;

        case 2:
          temp = nums[end];
          nums[end] = nums[mid];
          nums[mid] = temp;
          end--;
          break;
      }
    }

  }

}
