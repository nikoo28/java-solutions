package leetcode.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubsetsIITest {

  private final SubsetsII subsetsII;

  SubsetsIITest() {
    subsetsII = new SubsetsII();
  }

  @Test
  void testSubsetsWithDup1() {
    int[] nums = {1, 2, 2};
    List<List<Integer>> expectedList = new ArrayList<>();

    List<Integer> tempList = new ArrayList<>();
    expectedList.add(new ArrayList<>(tempList));

    tempList.clear();
    tempList.add(1);
    expectedList.add(new ArrayList<>(tempList));

    tempList.clear();
    tempList.add(1);
    tempList.add(2);
    expectedList.add(new ArrayList<>(tempList));

    tempList.clear();
    tempList.add(1);
    tempList.add(2);
    tempList.add(2);
    expectedList.add(new ArrayList<>(tempList));

    tempList.clear();
    tempList.add(2);
    expectedList.add(new ArrayList<>(tempList));

    tempList.clear();
    tempList.add(2);
    tempList.add(2);
    expectedList.add(new ArrayList<>(tempList));

    List<List<Integer>> actualList = subsetsII.subsetsWithDup(nums);

    assertEquals(expectedList, actualList);
  }
}