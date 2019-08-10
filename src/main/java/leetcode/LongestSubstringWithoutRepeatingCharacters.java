package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nikoo28 on 12/18/17 9:29 PM
 */

public class LongestSubstringWithoutRepeatingCharacters {

  public int lengthOfLongestSubstring(String s) {

    if (s == null || s.length() == 0)
      return 0;

    int maxLen = 1;

    List<Character> x = new ArrayList<>();
    for (int i = 0; i < s.length(); i++) {

      if (x.contains(s.charAt(i))) {

        maxLen = maxLen < x.size() ? x.size() : maxLen;

        while (x.get(0) != s.charAt(i))
          x.remove(0);
        x.remove(0);
      }

      x.add(s.charAt(i));
    }

    return maxLen < x.size() ? x.size() : maxLen;
  }

}
