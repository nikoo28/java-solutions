package leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

public class JumpGameIII {

  boolean canReach(int[] arr, int start) {

    Queue<Integer> q = new LinkedList<>();
    q.add(start);

    while (!q.isEmpty()) {
      int curr = q.poll();

      // reached the target index
      if (arr[curr] == 0)
        return true;

      // negative means we already tried it
      if (arr[curr] < 0)
        continue;

      // Try both directions
      if (curr + arr[curr] < arr.length) q.add(curr + arr[curr]);

      if (curr - arr[curr] >= 0) q.add(curr - arr[curr]);

      // mark this element as visited
      arr[curr] = -arr[curr];
    }

    return false;
  }

}
