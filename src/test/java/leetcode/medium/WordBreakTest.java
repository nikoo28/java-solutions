package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordBreakTest {

  private final WordBreak wordBreak;

  WordBreakTest() {
    wordBreak = new WordBreak();
  }

  @Test
  void testWordBreak1() {
    assertTrue(wordBreak.wordBreak("studyalgorithms", java.util.List.of("study", "algorithms")));
  }

  @Test
  void testWordBreak2() {
    assertTrue(wordBreak.wordBreak("applepenapple", java.util.List.of("apple", "pen")));
  }

  @Test
  void testWordBreak3() {
    assertFalse(wordBreak.wordBreak("catsandog", java.util.List.of("cats", "dog", "sand", "and", "cat")));
  }

  @Test
  void testWordBreak4() {
    assertTrue(wordBreak.wordBreak("aaaaaaa", java.util.List.of("aaaa", "aaa")));
  }

  @Test
  void testWordBreak5() {
    assertFalse(wordBreak.wordBreak("aaaaa", java.util.List.of("aaaa", "aaa")));
  }
}