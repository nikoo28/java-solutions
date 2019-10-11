package hackerrank.expedia;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nikoo28 on 2019-08-25 21:09
 */

class LongestVowelSubsequence {

  private static int longestSubsequence(String s) {

    Map<Character, Character> preVowelMap = new HashMap<>();
    preVowelMap.put('u', 'o');
    preVowelMap.put('o', 'i');
    preVowelMap.put('i', 'e');
    preVowelMap.put('e', 'a');

    Map<Character, String> longestRunningSeqMap = new HashMap<>();

    for (char currChar : s.toCharArray()) {

      String currentCharacterLongestSequence;
      String prevCharacterLongestSequence = null;
      if (currChar == 'a') {
        currentCharacterLongestSequence = longestRunningSeqMap.getOrDefault(currChar, "");
      } else {
        currentCharacterLongestSequence = longestRunningSeqMap.get(currChar);
        char prevChar = preVowelMap.get(currChar);
        prevCharacterLongestSequence = longestRunningSeqMap.get(prevChar);
      }

      if (prevCharacterLongestSequence == null
          && currentCharacterLongestSequence != null) {

        updateLongestRunningMap(currentCharacterLongestSequence, currChar, longestRunningSeqMap);
      }
      else if (currentCharacterLongestSequence == null
          && prevCharacterLongestSequence != null) {

        updateLongestRunningMap(prevCharacterLongestSequence, currChar, longestRunningSeqMap);
      }
      else if (currentCharacterLongestSequence != null) {
        if (currentCharacterLongestSequence.length() < prevCharacterLongestSequence.length()) {
          updateLongestRunningMap(prevCharacterLongestSequence, currChar, longestRunningSeqMap);
        } else {
          updateLongestRunningMap(currentCharacterLongestSequence, currChar, longestRunningSeqMap);
        }
      }
    }

    if (longestRunningSeqMap.get('u') == null) {
      return 0;
    }
    return longestRunningSeqMap.get('u').length();
  }

  private static void updateLongestRunningMap(String longSeq, char currentChar,
                                              Map<Character, String> longestRunningMap) {
    String currentCharSub = longSeq + currentChar;
    longestRunningMap.put(currentChar, currentCharSub);
  }

  public static void main(String[] args) {
    System.out.println(LongestVowelSubsequence.longestSubsequence("aeiaaioooaauuaeiou"));
    System.out.println(LongestVowelSubsequence.longestSubsequence("aeeiiouu"));
  }

}
