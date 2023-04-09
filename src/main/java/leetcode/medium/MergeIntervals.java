package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by nikoo28 on 11/8/19 12:58 AM
 */

class MergeIntervals {

  int[][] merge(int[][] intervals) {

    if (intervals.length <= 1)
      return intervals;

    // Sort by ascending starting point
    Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

    List<int[]> result = new ArrayList<>();

    int[] newInterval = intervals[0];
    result.add(newInterval);

    for (int[] interval : intervals) {
      if (interval[0] <= newInterval[1])
        // Overlapping intervals,
        // update the end if needed
        newInterval[1] = Math.max(newInterval[1], interval[1]);
      else {
        // Disjoint intervals,
        // add the new interval to the list
        newInterval = interval;
        result.add(newInterval);
      }
    }

    return result.toArray(new int[result.size()][]);
  }

}
