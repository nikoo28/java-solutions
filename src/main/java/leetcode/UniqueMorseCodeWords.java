package leetcode;

import java.util.HashSet;

/**
 * Created by nikoo28 on 9/22/18 5:25 PM
 */

class UniqueMorseCodeWords {

  public int uniqueMorseCodeRepresentations(String[] words) {

    String[] morseCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    StringBuilder morseRepresentation = new StringBuilder();
    HashSet<String> uniqueRepresentations = new HashSet<>();

    for (String word : words) {

      morseRepresentation.setLength(0);

      for (int i = 0; i < word.length(); i++) {
        morseRepresentation.append(morseCode[word.charAt(i) - 'a']);
      }

      uniqueRepresentations.add(morseRepresentation.toString());
    }

    return uniqueRepresentations.size();
  }

}
