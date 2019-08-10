package leetcode;

import java.util.Stack;

/**
 * @author nikoo28 on 9/15/17
 */
public class Brackets {

  public static int bracket_match(String bracket_string) {

    Stack<Character> chars = new Stack<>();

    for (int i = 0; i < bracket_string.length(); i++) {

      if (bracket_string.charAt(i) == '(')
        chars.push('(');

      else
        chars.pop();
    }

    return chars.size();
  }

}
