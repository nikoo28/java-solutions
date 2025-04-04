package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {

  private final RansomNote ransomNote;

  RansomNoteTest() {
    ransomNote = new RansomNote();
  }

  @Test
  void testCanConstruct1() {
    String ransomNoteStr = "a";
    String magazineStr = "b";
    assertFalse(ransomNote.canConstruct(ransomNoteStr, magazineStr));
  }

  @Test
  void testCanConstruct2() {
    String ransomNoteStr = "aa";
    String magazineStr = "ab";
    assertFalse(ransomNote.canConstruct(ransomNoteStr, magazineStr));
  }

  @Test
  void testCanConstruct3() {
    String ransomNoteStr = "aa";
    String magazineStr = "aab";
    assertTrue(ransomNote.canConstruct(ransomNoteStr, magazineStr));
  }
}
