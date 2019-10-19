package leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 10/16/19 1:25 AM
 */

class FindCommonCharactersTest {

  private FindCommonCharacters findCommonCharacters = new FindCommonCharacters();

  @Test
  void testCommonChars1() {
    String[] A = {"bella", "label", "roller"};

    List<String> expectedResult = new ArrayList<>();
    expectedResult.add("e");
    expectedResult.add("l");
    expectedResult.add("l");

    List<String> actualResult = findCommonCharacters.commonChars(A);
    Collections.sort(actualResult);
    Collections.sort(expectedResult);
    assertEquals(expectedResult, actualResult);
  }

  @Test
  void testCommonChars2() {
    String[] A = {"cool", "lock", "cook"};

    List<String> expectedResult = new ArrayList<>();
    expectedResult.add("c");
    expectedResult.add("o");

    List<String> actualResult = findCommonCharacters.commonChars(A);
    Collections.sort(actualResult);
    Collections.sort(expectedResult);
    assertEquals(expectedResult, actualResult);
  }

  @Test
  void testCommonChars3() {
    String[] A = {"acabcddd", "bcbdbcbd", "baddbadb", "cbdddcac", "aacbcccd", "ccccddda", "cababaab", "addcaccd"};

    List<String> expectedResult = new ArrayList<>();

    List<String> actualResult = findCommonCharacters.commonChars(A);
    Collections.sort(actualResult);
    Collections.sort(expectedResult);
    assertEquals(expectedResult, actualResult);
  }

  @Test
  void testCommonChars4() {
    String[] A = {"bbddabab", "cbcddbdd", "bbcadcab", "dabcacad", "cddcacbc", "ccbdbcba", "cbddaccc", "accdcdbb"};

    List<String> expectedResult = new ArrayList<>();
    expectedResult.add("b");
    expectedResult.add("d");

    List<String> actualResult = findCommonCharacters.commonChars(A);
    Collections.sort(actualResult);
    Collections.sort(expectedResult);
    assertEquals(expectedResult, actualResult);
  }
}