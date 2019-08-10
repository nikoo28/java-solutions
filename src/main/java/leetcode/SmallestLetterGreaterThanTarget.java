package leetcode;

/**
 * Created by nikoo28 on 12/17/17 12:56 AM
 */

public class SmallestLetterGreaterThanTarget {

  public char nextGreatestLetter(char[] letters, char target) {

    for (char letter : letters) {
      if (letter > target)
        return letter;
    }

    return letters[0];
  }

}
