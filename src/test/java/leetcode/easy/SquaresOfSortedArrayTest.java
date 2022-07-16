package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquaresOfSortedArrayTest {

  private final SquaresOfSortedArray squaresOfSortedArray;

  SquaresOfSortedArrayTest() {
    squaresOfSortedArray = new SquaresOfSortedArray();
  }

  @Test
  void testSortedSquares1() {
    int[] nums = {-4, -1, 0, 3, 10};
    int[] expected = {0, 1, 9, 16, 100};

    assertArrayEquals(expected, squaresOfSortedArray.sortedSquares(nums));
  }

  @Test
  void testSortedSquares2() {
    int[] nums = {-4, -2, -1};
    int[] expected = {1, 4, 16};

    assertArrayEquals(expected, squaresOfSortedArray.sortedSquares(nums));
  }

  @Test
  void testSortedSquares3() {
    int[] nums = {1, 2, 4};
    int[] expected = {1, 4, 16};

    assertArrayEquals(expected, squaresOfSortedArray.sortedSquares(nums));
  }
}