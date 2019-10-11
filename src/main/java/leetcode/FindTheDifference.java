package leetcode;

/**
 * @author nikoo28 on 9/17/17
 */
class FindTheDifference {

  public char findTheDifference(String s, String t) {

    int[] freq = new int[26];
    for (int i = 0; i < s.length(); i++) {
      freq[s.charAt(i) - 'a']++;
    }

    for (int i = 0; i < t.length(); i++) {
      freq[t.charAt(i) - 'a']--;
      if (freq[t.charAt(i) - 'a'] == -1)
        return t.charAt(i);
    }

    return 'a';
  }

}
