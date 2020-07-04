package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nikoo28 on 6/30/20 10:28 PM
 */

public class FirstUniqueCharacterInAString {

  public int firstUniqueChar(String str) {

    int index = -1;
    str = str.toLowerCase();

    Map<Character, Integer> charFreqMap = new HashMap<>();

    // Update the map
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);

      // Get the current frequency
      int freq = charFreqMap.getOrDefault(c, 0);

      // Update the map
      charFreqMap.put(c, (freq + 1));
    }

    for (int i = 0; i < str.length(); i++) {
      if (charFreqMap.get(str.charAt(i)) == 1) {
        index = i;
        break;
      }
    }

    return index;
  }
}
