package leetcode;

/**
 * Created by nikoo28 on 6/9/19 7:31 PM
 */

class MaximumSumTwoNonOverlappingSubarrays {

  public int maxSumTwoNoOverlap(int[] A, int L, int M) {

    // Construct prefix sum
    // This array contains sum of all contiguous elements
    for (int i = 1; i < A.length; i++) {
      A[i] = A[i - 1] + A[i];
    }

    // Assign initial values so we can skip 1st run in below for loop
    // Taking the default result to be the first L + M elements
    int res = A[L + M - 1];

    int maxL = A[L - 1];
    int maxM = A[M - 1];

    // Either L before M or M before L, start this loop at index L + M
    for (int i = L + M; i < A.length; i++) {

      // Keep track maxL so far
      // L before M: A[i - M] - A[i - M - L] is sum of L-length sub array
      maxL = Math.max(maxL, A[i - M] - A[i - M - L]);

      // Keep track maxM so far
      // M before L: A[i - M] - A[i - L - M] is sum of M-length sub array
      maxM = Math.max(maxM, A[i - L] - A[i - L - M]);

      // Keep track res so far
      // maxL + (A[i] - A[i - M]): Sum of max L-length sub array and current M-length sub array
      // maxM + (A[i] - A[i - L]): Sum of max M-length sub array and current L-length sub array
      res = Math.max(res, Math.max(maxL + (A[i] - A[i - M]), maxM + (A[i] - A[i - L])));
    }

    return res;
  }

  public static void main(String[] args) {

    int[] A = {3, 8, 1, 3, 2, 1, 8, 9, 0};
    int L = 3;
    int M = 2;

  }

}
