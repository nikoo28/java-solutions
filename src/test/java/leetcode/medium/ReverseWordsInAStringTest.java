package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 11/2/19 9:31 PM
 */

class ReverseWordsInAStringTest {

  ReverseWordsInAString reverseWordsInAString = new ReverseWordsInAString();

  @Test
  void testReverseWords() {
    String s = "the sky is blue";
    String expected = "blue is sky the";

    assertEquals(expected, reverseWordsInAString.reverseWords(s));
  }

  @Test
  void testReverseWords2() {
    String s = "  hello world!  ";
    String expected = "world! hello";

    assertEquals(expected, reverseWordsInAString.reverseWords(s));
  }

  @Test
  void testReverseWords3() {
    String s = "a good   example";
    String expected = "example good a";

    assertEquals(expected, reverseWordsInAString.reverseWords(s));
  }

}