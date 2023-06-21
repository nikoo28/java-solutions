package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfPangramTest {

  private final CheckIfPangram checkIfPangram;

  CheckIfPangramTest() {
    checkIfPangram = new CheckIfPangram();
  }

  @Test
  void testCheckIfPangram1() {
    String sentence = "thequickbrownfoxjumpsoverthelazydog";
    assertTrue(checkIfPangram.checkIfPangram(sentence));
  }

  @Test
  void testCheckIfPangram2() {
    String sentence = "studyalgorithms";
    assertFalse(checkIfPangram.checkIfPangram(sentence));
  }
}