package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 11/2/19 5:48 PM
 */

class ReverseWordsInAString3Test {

  private ReverseWordsInAString3 reverseWordsInAString3 = new ReverseWordsInAString3();

  @Test
  void testReverseWords() {

    String s = "Let's take LeetCode contest";
    String expected = "s'teL ekat edoCteeL tsetnoc";

    assertEquals(expected, reverseWordsInAString3.reverseWords(s));
  }
}