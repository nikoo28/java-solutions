package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class CheckIfPangram {

  boolean checkIfPangram(String sentence) {

    Set<Character> alphabetSet = new HashSet<>();

    // Add all characters from 'a' to 'z' in hashset
    for (int i = 'a'; i <= 'z'; i++) {
      alphabetSet.add((char) i);
    }

    // Remove every character and check
    // if set becomes empty at any point of time
    for (int i = 0; i < sentence.length(); i++) {
      alphabetSet.remove(sentence.charAt(i));
      if (alphabetSet.isEmpty())
        return true;
    }

    return false;
  }

}
