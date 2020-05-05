package hackerrank.expedia;

import java.util.Stack;

/**
 * Created by nikoo28 on 2019-08-25 20:55
 */

class Braces {

  // Complete the braces function below.
  private static String[] braces(String[] values) {

    String[] result = new String[values.length];
    int idx = 0;
    for (String value : values) {
      if (isValid(value)) {
        result[idx] = "YES";
      } else
        result[idx] = "NO";

      idx++;
    }

    return result;

  }

  private static boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) {
      if (c == '(') stack.push(')');
      else if (c == '{') stack.push('}');
      else if (c == '[') stack.push(']');
      else if (stack.isEmpty() || stack.pop() != c)
        return false;
    }
    return stack.isEmpty();
  }

  public static void main(String[] args) {
    Braces braces = new Braces();

    String[] br = {"{}[]()", "{[}]}"};
    System.out.println(braces.braces(br));
  }


}
