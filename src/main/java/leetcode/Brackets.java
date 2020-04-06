package leetcode;

import java.util.Stack;

/**
 * @author nikoo28 on 9/15/17
 */
class Brackets {

  public static int bracketMatch(String bracketString) {

    Stack<Character> chars = new Stack<>();

    for (int i = 0; i < bracketString.length(); i++) {

      if (bracketString.charAt(i) == '(')
        chars.push('(');

      else
        chars.pop();
    }

    return chars.size();
  }

}
