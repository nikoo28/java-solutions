package leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarraySumEqualsK {

  int longestSubarray(int[] arr, int k) {
    Map<Integer, Integer> sumSeenIndexMap = new HashMap<>();
    int res = 0;
    int prefSum = 0;

    for (int i = 0; i < arr.length; ++i) {
      prefSum += arr[i];

      // If prefixSum - k exists in the map then there exist such
      // subarray from (index of previous prefix + 1) to i.
      if (sumSeenIndexMap.containsKey(prefSum - k))
        res = Math.max(res, i - sumSeenIndexMap.get(prefSum - k));

      // Store only first occurrence index of prefSum
      if (!sumSeenIndexMap.containsKey(prefSum))
        sumSeenIndexMap.put(prefSum, i);
    }

    return res;
  }

}
