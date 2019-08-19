package leetcode.hard;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by nikoo28 on 2019-08-18 23:25
 */

public class MedianOfTwoSortedArrays {

  public double findMedianSortedArrays(int[] nums1, int[] nums2) {

    int[] smaller = nums1.length > nums2.length ? nums2 : nums1;
    int[] larger = nums1.length > nums2.length ? nums1 : nums2;
    int totalLength = nums1.length + nums2.length;

    int low = 0;
    int high = smaller.length;

    while (low <= high) {
      int partitionX = (low + high) / 2;
      int partitionY = (totalLength + 1) / 2 - partitionX;

      int leftXMax = partitionX == 0 ? Integer.MIN_VALUE : smaller[partitionX - 1];
      int rightXMin = partitionX == smaller.length ? Integer.MAX_VALUE : smaller[partitionX];

      int leftYMax = partitionY == 0 ? Integer.MIN_VALUE : larger[partitionY - 1];
      int rightYMin = partitionY == larger.length ? Integer.MAX_VALUE : larger[partitionY];

      if (leftXMax <= rightYMin && leftYMax <= rightXMin) {
        if ((totalLength) % 2 == 0) {
          return (Math.max(leftXMax, leftYMax) + Math.min(rightXMin, rightYMin)) / 2.0;
        } else
          return Math.max(leftXMax, leftYMax);
      }

      if (leftXMax > rightYMin) {
        high = partitionX - 1;
      } else
        low = partitionX + 1;
    }

    return 0;
  }

  public static void main(String[] args) {
    MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();

    int[] nums1 = {1,3,5,7};
    int[] nums2 = {2,4,6,8,10};
    System.out.println(medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2));

    nums1 = new int[]{1, 3, 8, 9, 15};
    nums2 = new int[]{7,11,18,19,21,25};
    System.out.println(medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2));

    nums1 = new int[]{1};
    nums2 = new int[]{7};
    System.out.println(medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2));
  }

}
