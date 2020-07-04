package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 6/30/20 10:36 PM
 */

class FirstUniqueCharacterInAStringTest {

  FirstUniqueCharacterInAString firstUniqueCharacterInAString = new FirstUniqueCharacterInAString();

  @Test
  void testFirstUniqueChar1() {
    String str = "studyalgorithms";
    assertEquals(2, firstUniqueCharacterInAString.firstUniqueChar(str));
  }

  @Test
  void testFirstUniqueChar2() {
    String str = "ilovecode";
    assertEquals(0, firstUniqueCharacterInAString.firstUniqueChar(str));
  }

  @Test
  void testFirstUniqueChar3() {
    String str = "loveleetcode";
    assertEquals(2, firstUniqueCharacterInAString.firstUniqueChar(str));
  }

  @Test
  void testFirstUniqueChar4() {
    String str = "leetcode";
    assertEquals(0, firstUniqueCharacterInAString.firstUniqueChar(str));
  }

  @Test
  void testFirstUniqueChar5() {
    String str = "lotsOfLove";
    assertEquals(2, firstUniqueCharacterInAString.firstUniqueChar(str));
  }

  @Test
  void testFirstUniqueChar6() {
    String str = "fourByFourFrog";
    assertEquals(4, firstUniqueCharacterInAString.firstUniqueChar(str));
  }
}