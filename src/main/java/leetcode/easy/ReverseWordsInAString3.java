package leetcode.easy;

import java.util.StringJoiner;

/**
 * @author nikoo28 on 9/10/17
 */
class ReverseWordsInAString3 {

  String reverseWords(String s) {

    String[] splits = s.split(" ");
    StringJoiner outputString = new StringJoiner(" ");

    for (String split : splits) {
      outputString.add(new StringBuilder(split).reverse().toString());
    }

    return outputString.toString();
  }
}
