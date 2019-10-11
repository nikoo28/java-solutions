package leetcode;

import java.util.*;

/**
 * Created by nikoo28 on 7/18/19 10:58 PM
 */

class WordLadder {

  private int ladderLength(String beginWord, String endWord, List<String> wordList) {

    Set<String> dict = new HashSet<>(wordList);
    Queue<String> queue = new LinkedList<>();
    queue.add(beginWord);
    int level = 1;
    while (!queue.isEmpty()) {
      int size = queue.size();
      for (int q = 0; q < size; q++) {
        char[] cur = queue.poll().toCharArray();
        for (int i = 0; i < cur.length; i++) {
          char tmp = cur[i];
          for (char chr = 'a'; chr <= 'z'; chr++) {
            cur[i] = chr;
            String dest = new String(cur);
            if (dict.contains(dest)) {
              if (dest.equals(endWord)) return level + 1;
              queue.add(dest);
              dict.remove(dest);
            }
          }
          cur[i] = tmp;
        }
      }
      level++;
    }
    return 0;

  }

  public static void main(String[] args) {
    WordLadder x = new WordLadder();

    List<String> wordList = new ArrayList<>();
    wordList.add("hot");
    wordList.add("dot");
    wordList.add("dog");
    wordList.add("lot");
    wordList.add("log");
    wordList.add("cog");

    System.out.println(x.ladderLength("hit", "cog", wordList));

  }

}
