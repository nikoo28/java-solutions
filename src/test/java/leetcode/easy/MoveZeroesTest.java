package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {

  private final MoveZeroes moveZeroes;

  MoveZeroesTest() {
    moveZeroes = new MoveZeroes();
  }

  @Test
  void testMoveZeroes1() {
    int[] arr = {0, 1, 0, 3, 12};
    int[] expectedResult = {1, 3, 12, 0, 0};

    moveZeroes.moveZeroes(arr);
    assertArrayEquals(expectedResult, arr);
  }

  @Test
  void testMoveZeroes2() {
    int[] arr = {0, 0, 0};
    int[] expected = {0, 0, 0};

    moveZeroes.moveZeroes(arr);
    assertArrayEquals(expected, arr);
  }

  @Test
  void testMoveZeroes3() {
    int[] arr = {1, 2, 3};
    int[] expected = {1, 2, 3};

    moveZeroes.moveZeroes(arr);
    assertArrayEquals(expected, arr);
  }
}