package leetcode;

/**
 * Created by nikoo28 on 9/22/18 5:43 PM
 */

class PeakIndexInAMountainArray {

  public int peakIndexInMountainArray(int[] A) {

    int peak = Integer.MIN_VALUE;
    int peakIdx = -1;
    int idx = 0;
    while (peak < A[idx]) {
      peak = A[idx];
      idx++;
    }

    peakIdx = idx - 1;

    if (idx == A.length)
      return -1;

    while (idx < A.length) {
      if (A[idx] > peak)
        return -1;

      idx++;
    }

    return peakIdx;
  }

}
