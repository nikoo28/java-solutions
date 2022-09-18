package leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nikoo28 on 9/18/22 1:46 PM
 */

public class LongestConsecutiveSequence {

  int longestConsecutive(int[] nums) {

    int longestLength = 0;
    Map<Integer, Boolean> numberTravelledMap = new HashMap<>();
    for (int num : nums) {
      numberTravelledMap.put(num, Boolean.FALSE);
    }

    for (int num : nums) {
      int currentLength = 1;

      // Check in forward direction
      int nextNum = num + 1;
      while (numberTravelledMap.containsKey(nextNum) &&
          numberTravelledMap.get(nextNum) == false) {

        currentLength++;
        numberTravelledMap.put(nextNum, Boolean.TRUE);

        // Move to the next number
        nextNum++;
      }

      // Check in reverse direction
      int prevNum = num - 1;
      while (numberTravelledMap.containsKey(prevNum) &&
          numberTravelledMap.get(prevNum) == false) {

        currentLength++;
        numberTravelledMap.put(prevNum, Boolean.TRUE);

        // Move to the previous number
        prevNum--;
      }

      longestLength = Math.max(longestLength, currentLength);
    }

    return longestLength;
  }

}
