package leetcode.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 1/31/21 4:11 AM
 */

class GroupAnagramsTest {

  private final GroupAnagrams groupAnagrams;

  public GroupAnagramsTest() {
    groupAnagrams = new GroupAnagrams();
  }

  @Test
  void testGroupAnagramsCategorizeBySorting1() {
    String[] strs = {"eat","tea","tan","ate","nat","bat"};

    List<List<String>> expectedList = new ArrayList<>();
    expectedList.add(new ArrayList<>(Arrays.asList("eat", "tea", "ate")));
    expectedList.add(new ArrayList<>(Arrays.asList("tan", "nat")));
    expectedList.add(new ArrayList<>(Arrays.asList("bat")));
    List<Integer> expectedGroupLengths = new ArrayList<>();
    for (List<String> strings : expectedList) {
      expectedGroupLengths.add(strings.size());
    }

    List<List<String>> actualList = groupAnagrams.groupAnagramsCategorizeBySorting(strs);
    List<Integer> actualGroupLengths = new ArrayList<>();
    for (List<String> strings : actualList) {
      actualGroupLengths.add(strings.size());
    }

    Collections.sort(expectedGroupLengths);
    Collections.sort(actualGroupLengths);
    assertEquals(expectedGroupLengths.toString(), actualGroupLengths.toString());
    assertEquals(expectedList.size(), actualList.size());
  }

  @Test
  void testGroupAnagramsCategorizeByFrequency1() {
    String[] strs = {"eat","tea","tan","ate","nat","bat"};

    List<List<String>> expectedList = new ArrayList<>();
    expectedList.add(new ArrayList<>(Arrays.asList("eat", "tea", "ate")));
    expectedList.add(new ArrayList<>(Arrays.asList("tan", "nat")));
    expectedList.add(new ArrayList<>(Arrays.asList("bat")));
    List<Integer> expectedGroupLengths = new ArrayList<>();
    for (List<String> strings : expectedList) {
      expectedGroupLengths.add(strings.size());
    }

    List<List<String>> actualList = groupAnagrams.groupAnagramsCategorizeByFrequency(strs);
    List<Integer> actualGroupLengths = new ArrayList<>();
    for (List<String> strings : actualList) {
      actualGroupLengths.add(strings.size());
    }

    Collections.sort(expectedGroupLengths);
    Collections.sort(actualGroupLengths);
    assertEquals(expectedGroupLengths.toString(), actualGroupLengths.toString());
    assertEquals(expectedList.size(), actualList.size());
  }
}