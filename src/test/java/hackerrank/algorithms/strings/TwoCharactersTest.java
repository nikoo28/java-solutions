package hackerrank.algorithms.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 8/25/20 9:52 PM
 */

class TwoCharactersTest {

  private TwoCharacters twoCharacters = new TwoCharacters();

  @Test
  void testTwoCharacters1() {
    String str = "beabeefeab";
    assertEquals(5, twoCharacters.alternate(str));
  }

  @Test
  void testTwoCharacters2() {
    String str = "jshdjshdjshdjs";
    assertEquals(8, twoCharacters.alternate(str));
  }

}