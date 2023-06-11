package leetcode.easy;

public class ShuffleString {

  String restoreString(String s, int[] indices) {

    // Character array to form final string
    char[] str = new char[s.length()];

    // Do what the question says
    for (int i = 0; i < s.length(); i++) {
      str[indices[i]] = s.charAt(i);
    }

    // Return the restored string
    return String.valueOf(str);
  }

}
