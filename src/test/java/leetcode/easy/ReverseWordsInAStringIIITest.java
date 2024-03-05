package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsInAStringIIITest {

  private final ReverseWordsInAStringIII reverseWordsInAStringIII;

  ReverseWordsInAStringIIITest() {
    reverseWordsInAStringIII = new ReverseWordsInAStringIII();
  }

  @Test
  void testReverseWords1() {
    String s = "Let's take LeetCode contest";
    String expected = "s'teL ekat edoCteeL tsetnoc";

    assertEquals(expected, reverseWordsInAStringIII.reverseWords(s));
  }

  @Test
  void testReverseWords2() {
    String s = "God Ding";
    String expected = "doG gniD";

    assertEquals(expected, reverseWordsInAStringIII.reverseWords(s));
  }

  @Test
  void testReverseWords3() {
    String s = "Hello World";
    String expected = "olleH dlroW";

    assertEquals(expected, reverseWordsInAStringIII.reverseWords(s));
  }
}