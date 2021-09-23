package hackerrank.algorithms.strings;

import java.util.HashMap;
import java.util.Map;

public class BetterCompression {

  public String betterCompression(String s) {

    StringBuilder result = new StringBuilder();
    Map<Character, Integer> charFrequencyMap = new HashMap<>();

    // Populate the character frequency map
    for (int i = 'a'; i <= 'z'; i++) {
      charFrequencyMap.put((char) i, 0);
    }

    for (int i = 0; i < s.length(); ) {
      // Get the character
      char c = s.charAt(i++);

      // Get the frequency and it may be double digits, so get all of them
      StringBuilder digits = new StringBuilder();
      while (!(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) {
        digits.append(s.charAt(i++));

        // Break if we have reached the end
        if (i == s.length())
          break;
      }

      // Get the current frequency from map
      int currentFreq = charFrequencyMap.get(c);

      // Add the new digits
      int newFreq = currentFreq + Integer.parseInt(digits.toString());

      // Put the new frequency
      charFrequencyMap.put(c, newFreq);
    }

    // Go over the frequency map and populate the result
    for (Map.Entry<Character, Integer> characterIntegerEntry : charFrequencyMap.entrySet()) {
      // If the frequency was 0, we do not want it in output
      if (characterIntegerEntry.getValue() == 0)
        continue;

      result.append(characterIntegerEntry.getKey()).append(characterIntegerEntry.getValue());
    }

    return result.toString();
  }

}
