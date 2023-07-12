package leetcode.medium;

public class ReorganizeString {

  String reorganizeString(String str) {
    int[] hash = new int[26];
    for (int i = 0; i < str.length(); i++) hash[str.charAt(i) - 'a']++;

    int max = 0, letter = 0;
    for (int i = 0; i < hash.length; i++)
      if (hash[i] > max) {
        max = hash[i];
        letter = i;
      }

    if (max > (str.length() + 1) / 2) return "";

    char[] res = new char[str.length()];

    // Fill all even places with majority character
    int idx = 0;
    while (hash[letter]-- > 0) {
      res[idx] = (char) (letter + 'a');
      idx += 2;
    }

    // Fill the remaining characters
    for (int i = 0; i < hash.length; i++)
      while (hash[i]-- > 0) {
        if (idx >= res.length) idx = 1;

        res[idx] = (char) (i + 'a');
        idx += 2;
      }

    return String.valueOf(res);
  }

}
