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

    for (int i = 0; i < str.length(); i++) {
      char x = str.charAt(i);

      if (characterStack.isEmpty())
        characterStack.push(x);
      else if (x == characterStack.peek())
        characterStack.pop();
      else
        characterStack.push(x);
    }

    StringBuilder resultBuilder = new StringBuilder();
    for (Character character : characterStack)
      resultBuilder.append(character);

    return resultBuilder.length() == 0 ?
        "Empty String" : resultBuilder.toString();
  }
}
