package leetcode.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 11/8/19 1:21 AM
 */

class MergeIntervalsTest {

  private MergeIntervals mergeIntervals = new MergeIntervals();

  @Test
  void testMerge1() {
    int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
    int[][] expectedOutput = {{1, 6}, {8, 10}, {15, 18}};

    int[][] actualOutput = mergeIntervals.merge(intervals);
    assertTrue(Arrays.deepEquals(expectedOutput, actualOutput));
  }

  @Test
  void testMerge2() {
    int[][] intervals = {{1, 9}, {2, 5}, {19, 20}, {10, 11}, {12, 20}, {0, 3}, {0, 1}, {0, 2}};
    int[][] expectedOutput = {{0, 9}, {10, 11}, {12, 20}};

    int[][] actualOutput = mergeIntervals.merge(intervals);
    assertTrue(Arrays.deepEquals(expectedOutput, actualOutput));
  }

  @Test
  void testMerge3() {
    int[][] intervals = {{1, 4}, {4, 5}};
    int[][] expectedOutput = {{1, 5}};

    int[][] actualOutput = mergeIntervals.merge(intervals);
    assertTrue(Arrays.deepEquals(expectedOutput, actualOutput));
  }
}