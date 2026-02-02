package leetcode.hard;

/**
 * Created by nikoo28 on 2019-08-18 23:25
 */

class MedianOfTwoSortedArrays {

  public double findMedianSortedArrays(int[] nums1, int[] nums2) {

    int[] smaller = nums1.length > nums2.length ? nums2 : nums1;
    int[] larger = nums1.length > nums2.length ? nums1 : nums2;
    int totalLength = nums1.length + nums2.length;

    int low = 0, high = smaller.length;

    while (low <= high) {
      int partitionX = (low + high) / 2;
      int partitionY = (totalLength + 1) / 2 - partitionX;

      int l1 = partitionX == 0 ? Integer.MIN_VALUE : smaller[partitionX - 1];
      int r1 = partitionX == smaller.length ? Integer.MAX_VALUE : smaller[partitionX];

      int l2 = partitionY == 0 ? Integer.MIN_VALUE : larger[partitionY - 1];
      int r2 = partitionY == larger.length ? Integer.MAX_VALUE : larger[partitionY];

      if (l1 <= r2 && l2 <= r1)
        // means this is a valid partition
        if ((totalLength) % 2 == 0)
          return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
        else
          return Math.max(l1, l2);

      if (l1 > r2) high = partitionX - 1;
      else low = partitionX + 1;
    }

    return 0;
  }
}
