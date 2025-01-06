package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonOverlappingIntervalsTest {

  private final NonOverlappingIntervals nonOverlappingIntervals;

  NonOverlappingIntervalsTest() {
    nonOverlappingIntervals = new NonOverlappingIntervals();
  }

  @Test
  void testEraseOverlapIntervals1() {
    assertEquals(1, nonOverlappingIntervals.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}}));
  }

  @Test
  void testEraseOverlapIntervals2() {
    assertEquals(2, nonOverlappingIntervals.eraseOverlapIntervals(new int[][]{{1, 2}, {1, 2}, {1, 2}}));
  }

  @Test
  void testEraseOverlapIntervals3() {
    assertEquals(0, nonOverlappingIntervals.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}}));
  }
}