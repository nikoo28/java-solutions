package leetcode.easy;

public class BackspaceStringCompare {

  boolean backspaceCompare(String s, String t) {
    return getActual(s).equals(getActual(t));
  }

  private String getActual(String input) {

    StringBuilder actualString = new StringBuilder();

    int hashCount = 0;
    for (int i = input.length() - 1; i >= 0 ; i--) {

      // Keep a count of backspace characters
      if (input.charAt(i) == '#') {
        hashCount++;
        continue;
      }

      // If it is a character
      if (hashCount < 1) {
        // If no backspace yet, just insert
        // at beginning
        actualString.insert(0, input.charAt(i));
      } else {
        // If we have a count of backspace
        // reduce it and skip the character
        hashCount--;
      }
    }

    return actualString.toString();
  }
}
