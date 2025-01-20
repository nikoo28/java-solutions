package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertIntervalTest {

  private final InsertInterval insertInterval;

  InsertIntervalTest() {
    insertInterval = new InsertInterval();
  }

  @Test
  void testInsert1() {
    int[][] intervals = {{1, 3}, {6, 9}};
    int[] newInterval = {2, 5};
    int[][] expected = {{1, 5}, {6, 9}};
    assertArrayEquals(expected, insertInterval.insert(intervals, newInterval));
  }

  @Test
  void testInsert2() {
    int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
    int[] newInterval = {4, 8};
    int[][] expected = {{1, 2}, {3, 10}, {12, 16}};
    assertArrayEquals(expected, insertInterval.insert(intervals, newInterval));
  }

  @Test
  void testInsert3() {
    int[][] intervals = {};
    int[] newInterval = {5, 7};
    int[][] expected = {{5, 7}};
    assertArrayEquals(expected, insertInterval.insert(intervals, newInterval));
  }

  @Test
  void testInsert4() {
    int[][] intervals = {{1, 5}};
    int[] newInterval = {2, 3};
    int[][] expected = {{1, 5}};
    assertArrayEquals(expected, insertInterval.insert(intervals, newInterval));
  }
}
