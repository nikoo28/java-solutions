package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPerfectSquareTest {

  private final ValidPerfectSquare validPerfectSquare;

  ValidPerfectSquareTest() {
    validPerfectSquare = new ValidPerfectSquare();
  }

  @Test
  void testIsPerfectSquareBinary() {
    assertTrue(validPerfectSquare.isPerfectSquareBinary(16));
    assertTrue(validPerfectSquare.isPerfectSquareBinary(1));
    assertFalse(validPerfectSquare.isPerfectSquareBinary(14));
    assertFalse(validPerfectSquare.isPerfectSquareBinary(-1));
  }

  @Test
  void testIsPerfectSquareMaths() {
    assertTrue(validPerfectSquare.isPerfectSquareMaths(16));
    assertTrue(validPerfectSquare.isPerfectSquareMaths(1));
    assertFalse(validPerfectSquare.isPerfectSquareMaths(14));
    assertFalse(validPerfectSquare.isPerfectSquareMaths(-1));
  }
}