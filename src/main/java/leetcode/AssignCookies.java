package leetcode;

import java.util.Arrays;

/**
 * Created by nikoo28 on 12/17/17 8:50 PM
 */

class AssignCookies {

  public int findContentChildren(int[] g, int[] s) {
    Arrays.sort(g);
    Arrays.sort(s);

    int count = 0;

    for (int i = 0; i < s.length; i++) {

      if (count == g.length) break;

      while (g[count] > s[i]) {
        i++;
        if (i == s.length)
          break;
      }

      if (i == s.length) break;
      count++;
    }

    return count;
  }

}
