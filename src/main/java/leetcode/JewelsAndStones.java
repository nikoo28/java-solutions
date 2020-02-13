package leetcode;

import java.util.HashSet;

/**
 * Created by nikoo28 on 7/16/19 2:27 AM
 */

class JewelsAndStones {

  public int numJewelsInStones(String J, String S) {

    HashSet<Character> Jset = new HashSet<>();
    for (char j : J.toCharArray())
      Jset.add(j);

    int ans = 0;
    for (char s : S.toCharArray())
      if (Jset.contains(s))
        ans++;
    return ans;
  }

}
