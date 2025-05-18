package leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {

  int findMaxLength(int[] nums) {

    if (nums == null || nums.length == 0) { // Base Case
      return 0;
    }

    // Converting all 0 to -1
    for (int i = 0; i < nums.length; i++)
      if (nums[i] == 0) nums[i] = -1;

    int sum = 0; // current
    int maxLength = 0; // final-ans

    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, -1); // put sentinel value

    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];

      if (map.containsKey(sum)) {
        // if present, update length
        int last = map.get(sum);
        maxLength = Math.max(maxLength, i - last);
      } else
        map.put(sum, i);

    }

    return maxLength;
  }

}
