package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumDominoRotationsForEqualRowTest {

  private MinimumDominoRotationsForEqualRow minimumDominoRotationsForEqualRow = new MinimumDominoRotationsForEqualRow();

  @Test
  void testMinDominoRotations1() {
    int[] A = {2, 1, 2, 4, 2, 2};
    int[] B = {5, 2, 6, 2, 3, 2};

    assertEquals(2, minimumDominoRotationsForEqualRow.minDominoRotations(A, B));
  }

  @Test
  void testMinDominoRotations2() {
    int[] A = {3, 5, 1, 2, 3};
    int[] B = {3, 6, 3, 3, 4};

    assertEquals(-1, minimumDominoRotationsForEqualRow.minDominoRotations(A, B));
  }
}