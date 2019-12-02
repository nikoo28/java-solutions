package leetcode.medium;

/**
 * Created by nikoo28 on 2019-08-23 22:44
 */

class ReverseWordsInAString {

  String reverseWords(String s) {

    String[] words = s.split("\\s+");
    StringBuilder reversed = new StringBuilder();

    for (int i = words.length - 1; i >=0 ; i--) {
      reversed.append(words[i].trim());
      reversed.append(" ");
    }

    return reversed.toString().trim();
  }
}
