package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordTest {

  private final LengthOfLastWord lengthOfLastWord;

  LengthOfLastWordTest() {
    lengthOfLastWord = new LengthOfLastWord();
  }

  @Test
  void testLengthOfLastWord1() {
    String s = "Hello World";
    assertEquals(5, lengthOfLastWord.lengthOfLastWord(s));
  }

  @Test
  void testLengthOfLastWord2() {
    String s = "   fly me   to   the moon   ";
    assertEquals(4, lengthOfLastWord.lengthOfLastWord(s));
  }

  @Test
  void testLengthOfLastWord3() {
    String s = "luffy is still joyboy";
    assertEquals(6, lengthOfLastWord.lengthOfLastWord(s));
  }
}