package leetcode;

/**
 * @author nikoo28 on 9/15/17
 */
class FourLetterWords {

  public static int four_letter_words(String sentence) {
    String[] split = sentence.split(" ");
    int count = 0;
    for (String s : split) {
      if (s.length() == 4)
        count++;
    }
    return count;

  }

}
