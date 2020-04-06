package leetcode.medium;

public class MinimumDominoRotationsForEqualRow {

  public int minDominoRotations(int[] A, int[] B) {

    int minTop = Integer.MAX_VALUE;

    // Check if top is possible
    boolean isTopPossible = true;
    for (int i = 1; i < A.length; i++) {
      if (A[0] != A[i] && A[0] != B[i]) {
        isTopPossible = false;
        break;
      }
    }

    if (isTopPossible) {
      int topRotations = 0;
      for (int j = 1; j < A.length; j++) {
        if (A[j] != A[0]) {
          topRotations++;
        }
      }

      int bottomRotations = 1;
      for (int j = 1; j < A.length; j++) {
        if (B[j] != A[0]) {
          bottomRotations++;
        }
      }
      minTop = Math.min(topRotations, bottomRotations);
    }

    int minBottom = Integer.MAX_VALUE;

    // Check if bottom is possible
    boolean isBottomPossible = true;
    for (int i = 1; i < A.length; i++) {
      if (B[0] != A[i] && B[0] != B[i]) {
        isBottomPossible = false;
        break;
      }
    }

    if (isBottomPossible) {
      int topRotations = 1;
      for (int j = 1; j < A.length; j++) {
        if (A[j] != B[0]) {
          topRotations++;
        }
      }

      int bottomRotations = 0;
      for (int j = 1; j < A.length; j++) {
        if (B[j] != B[0]) {
          bottomRotations++;
        }
      }
      minBottom = Math.min(topRotations, bottomRotations);
    }

    if (!isTopPossible && !isBottomPossible)
      return -1;
    else
      return Math.min(minTop, minBottom);
  }

}
