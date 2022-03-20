package leetcode.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SubsetsTest {

  private final Subsets subsets;

  SubsetsTest() {
    subsets = new Subsets();
  }

  @Test
  public void testSubsets1() {
    int[] nums = {1, 2, 3};
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
    tempList.add(3);
    expectedList.add(new ArrayList<>(tempList));

    tempList.clear();
    tempList.add(1);
    tempList.add(3);
    expectedList.add(new ArrayList<>(tempList));

    tempList.clear();
    tempList.add(2);
    expectedList.add(new ArrayList<>(tempList));

    tempList.clear();
    tempList.add(2);
    tempList.add(3);
    expectedList.add(new ArrayList<>(tempList));

    tempList.clear();
    tempList.add(3);
    expectedList.add(new ArrayList<>(tempList));

    List<List<Integer>> actualList = this.subsets.subsets(nums);

    assertEquals(expectedList, actualList);
  }

  @Test
  public void testSubsets2() {
    int[] nums = {1};
    List<List<Integer>> expectedList = new ArrayList<>();

    List<Integer> tempList = new ArrayList<>();
    expectedList.add(new ArrayList<>(tempList));

    tempList.clear();
    tempList.add(1);
    expectedList.add(new ArrayList<>(tempList));

    List<List<Integer>> actualList = this.subsets.subsets(nums);

    assertEquals(expectedList, actualList);
  }
}