package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberTest {

  private final MissingNumber missingNumber;

  MissingNumberTest() {
    missingNumber = new MissingNumber();
  }

  @Test
  void testMissingNumber1() {
    int[] nums = {0, 1};

    assertEquals(2, missingNumber.missingNumber(nums));
  }

  @Test
  void testMissingNumber2() {
    int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};

    assertEquals(8, missingNumber.missingNumber(nums));
  }

  @Test
  void testMissingNumber3() {
    int[] nums = {0};

    assertEquals(1, missingNumber.missingNumber(nums));
  }
}