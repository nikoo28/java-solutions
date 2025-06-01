package leetcode.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindAllAnagramsInAStringTest {

  private final FindAllAnagramsInAString findAllAnagramsInAString;

  FindAllAnagramsInAStringTest() {
    findAllAnagramsInAString = new FindAllAnagramsInAString();
  }

  @Test
  void testFindAnagrams1() {
    String s = "cbaebabacd";
    String p = "abc";
    assertEquals(List.of(0, 6), findAllAnagramsInAString.findAnagrams(s, p));
  }

  @Test
  void testFindAnagrams2() {
    String s = "abab";
    String p = "ab";
    assertEquals(List.of(0, 1, 2), findAllAnagramsInAString.findAnagrams(s, p));
  }

  @Test
  void testFindAnagrams3() {
    String s = "aaaaaaaaaa";
    String p = "a";
    assertEquals(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9), findAllAnagramsInAString.findAnagrams(s, p));
  }

  @Test
  void testFindAnagrams4() {
    String s = "abababab";
    String p = "ab";
    assertEquals(List.of(0, 1, 2, 3, 4, 5, 6), findAllAnagramsInAString.findAnagrams(s, p));
  }
}
