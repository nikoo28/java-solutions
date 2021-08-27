package hackerrank.algorithms.strings;

public class CamelCase {

  public int camelcase(String s) {
    int numberOfWords = 0;

    for (int i = 0; i < s.length(); i++) {
      // Get the character
      char c = s.charAt(i);

      // Check if the character is a capital letter
      if (c >= 'A' && c <= 'Z') {
        // This is a start of new word
        numberOfWords++;
      }
    }

    // Since the first word starts with a small letter
    numberOfWords = numberOfWords + 1;

    return numberOfWords;
  }

}
