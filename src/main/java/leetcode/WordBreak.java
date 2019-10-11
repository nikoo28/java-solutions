package leetcode;

import java.util.*;

/**
 * Created by nikoo28 on 7/18/19 9:50 PM
 */

class WordBreak {

  public boolean wordBreak(String s, List<String> wordDict) {

    int[] visited = new int[s.length()];
    Set<String> dictSet = new HashSet<>(wordDict);
    Queue<Integer> queue = new LinkedList<>();
    queue.add(0);
    while (!queue.isEmpty()) {
      Integer begin = queue.remove();
      if (visited[begin] == 0) {
        for (int i = begin + 1; i <= s.length(); i++) {

          String substring = s.substring(begin, i);
          if (dictSet.contains(substring)) {
            queue.add(i);
            if (i == s.length())
              return true;
          }
        }
        visited[begin] = 1;
      }
    }

    return false;
  }

}
