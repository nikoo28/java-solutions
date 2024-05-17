package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversePrefixOfWordTest {

  private final ReversePrefixOfWord reversePrefixOfWord;

  ReversePrefixOfWordTest() {
    reversePrefixOfWord = new ReversePrefixOfWord();
  }

  @Test
  void testReversePrefix1() {
    String word = "abcdefd";
    char ch = 'd';

    assertEquals("dcbaefd", reversePrefixOfWord.reversePrefix(word, ch));
  }

  @Test
  void testReversePrefix2() {
    String word = "xyxzxe";
    char ch = 'x';

    assertEquals("xyxzxe", reversePrefixOfWord.reversePrefix(word, ch));
  }

  @Test
  void testReversePrefix3() {
    String word = "abcdefd";
    char ch = 'x';

    assertEquals("abcdefd", reversePrefixOfWord.reversePrefix(word, ch));
  }
}