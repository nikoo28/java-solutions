package hackerrank.algorithms.strings;

import java.util.Stack;

public class SuperReducedString {

  public String superReducedString(String str) {

    for (int i = 1; i < str.length(); i++) {

      if (str.charAt(i) == str.charAt(i - 1)) {
        str = str.substring(0, i - 1) + str.substring(i + 1);
        i = 0;
      }
    }

    return str.length() == 0 ? "Empty String" : str;
  }

  public String superReducedStringUsingStacks(String str) {

    Stack<Character> characterStack = new Stack<>();

    for (char c : str.toCharArray()) {

      if (characterStack.isEmpty())
        characterStack.push(c);
      else if (c == characterStack.peek())
        characterStack.pop();
      else
        characterStack.push(c);
    }

    StringBuilder resultBuilder = new StringBuilder();
    for (Character character : characterStack)
      resultBuilder.append(character);

    return resultBuilder.length() == 0 ?
        "Empty String" : resultBuilder.toString();
  }
}
