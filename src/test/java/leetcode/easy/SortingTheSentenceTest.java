package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortingTheSentenceTest {

  private final SortingTheSentence sortingTheSentence;

  SortingTheSentenceTest() {
    sortingTheSentence = new SortingTheSentence();
  }

  @Test
  void testSortSentence1() {
    String s = "sentence4 a3 is2 This1";
    String expected = "This is a sentence";

    String actual = sortingTheSentence.sortSentence(s);
    assertEquals(expected, actual);
  }

  @Test
  void testSortSentence2() {
    String s = "is2 sentence4 This1 a3";
    String expected = "This is a sentence";

    String actual = sortingTheSentence.sortSentence(s);
    assertEquals(expected, actual);
  }

  @Test
  void testSortSentence3() {
    String s = "Myself2 Me1 I4 and3";
    String expected = "Me Myself and I";

    String actual = sortingTheSentence.sortSentence(s);
    assertEquals(expected, actual);
  }
}