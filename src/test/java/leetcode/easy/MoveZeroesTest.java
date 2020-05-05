package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {

  MoveZeroes moveZeroes = new MoveZeroes();

  @Test
  void moveZeroes() {
    int[] arr = {0, 1, 0, 3, 12};
    int[] expectedResult = {1, 3, 12, 0, 0};

    moveZeroes.moveZeroes(arr);
    assertArrayEquals(expectedResult, arr);
  }
}