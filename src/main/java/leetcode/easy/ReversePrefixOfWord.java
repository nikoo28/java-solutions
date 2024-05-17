package leetcode.easy;

import java.util.Stack;

public class ReversePrefixOfWord {

  String reversePrefix(String word, char ch) {

    int firstOccurrence = word.indexOf(ch);
    if (firstOccurrence == -1)
      return word;

    Stack<Character> charStack = new Stack<>();

    // Add all elements to stack
    for (int i = 0; i <= firstOccurrence; i++)
      charStack.push(word.charAt(i));

    StringBuilder result = new StringBuilder();

    // POP elements of stack
    while (!charStack.isEmpty())
      result.append(charStack.pop());

    // Add all remaining chars
    for (int i = (firstOccurrence + 1); i < word.length(); i++)
      result.append(word.charAt(i));

    return result.toString();
  }

}
