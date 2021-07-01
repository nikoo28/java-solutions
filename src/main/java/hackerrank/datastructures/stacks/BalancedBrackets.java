package hackerrank.datastructures.stacks;

import java.util.Stack;

public class BalancedBrackets {

  public String isBalanced(String s) {

    Stack<Character> bracketStack = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
      char x = s.charAt(i);

      if (x == '{' || x == '[' || x == '(') {
        bracketStack.push(x);
        continue;
      }

      // Try to pop a matching bracket. If not found, it means
      // invalid expression
      if (bracketStack.isEmpty())
        return "NO";

      char poppedElement = bracketStack.pop();
      if (x == ']' && poppedElement != '[') return "NO";
      if (x == '}' && poppedElement != '{') return "NO";
      if (x == ')' && poppedElement != '(') return "NO";
    }

    return bracketStack.isEmpty() ? "YES" : "NO";
  }

  public String isBalancedConcise(String s) {

    while (true) {
      int originalLength = s.length();

      // Replace all matching pairs
      s = s.replace("[]", "");
      s = s.replace("()", "");
      s = s.replace("{}", "");

      // Find new length
      int newLength = s.length();

      // If new length is same as old length, no more replacements possible
      // we need to exit the loop
      if (newLength == originalLength)
        break;
    }

    return s.length() == 0 ? "YES" : "NO";
  }

}
