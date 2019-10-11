package leetcode;

/**
 * @author nikoo28 on 9/17/17
 */
class DetectCapital {

  public boolean detectCapitalUse(String word) {
    return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+");
  }

}
