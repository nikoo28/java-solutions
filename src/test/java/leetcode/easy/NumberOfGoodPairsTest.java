package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfGoodPairsTest {

  private final NumberOfGoodPairs numberOfGoodPairs;

  NumberOfGoodPairsTest() {
    numberOfGoodPairs = new NumberOfGoodPairs();
  }

  @Test
  void testNumIdenticalPairs1() {
    int[] nums = {1, 2, 3, 1, 1, 3};

    assertEquals(4, numberOfGoodPairs.numIdenticalPairs(nums));
  }

  @Test
  void testNumIdenticalPairs2() {
    int[] nums = {1, 1, 1, 1};

    assertEquals(6, numberOfGoodPairs.numIdenticalPairs(nums));
  }

  @Test
  void testNumIdenticalPairs3() {
    int[] nums = {1, 2, 3};

    assertEquals(0, numberOfGoodPairs.numIdenticalPairs(nums));
  }
}