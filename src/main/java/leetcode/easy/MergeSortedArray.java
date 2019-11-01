package leetcode.easy;

/**
 * Created by nikoo28 on 2019-08-24 22:36
 */

class MergeSortedArray {

  private void merge(int[] nums1, int m, int[] nums2, int n) {

    int lastPointer1 = m - 1;
    int lastPointer2 = n - 1;

    int resultPointer = nums1.length - 1;
    while (lastPointer1 >= 0 && lastPointer2 >= 0) {

      if (nums1[lastPointer1] > nums2[lastPointer2]) {
        nums1[resultPointer] = nums1[lastPointer1];
        lastPointer1--;
      } else {
        nums1[resultPointer] = nums2[lastPointer2];
        lastPointer2--;
      }
      resultPointer--;
    }
    System.arraycopy(nums2, 0, nums1, 0, lastPointer2 + 1);
  }

  public static void main(String[] args) {
    int[] nums1 = {1, 2, 3, 0, 0, 0};
    int[] nums2 = {2, 5, 6};

    MergeSortedArray mergeSortedArray = new MergeSortedArray();
    mergeSortedArray.merge(nums1, 3, nums2, 3);
  }

}
