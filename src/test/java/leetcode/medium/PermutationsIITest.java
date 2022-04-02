package leetcode.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PermutationsIITest {

  private final PermutationsII permutationsII;

  PermutationsIITest() {
    permutationsII = new PermutationsII();
  }

  @Test
  void testPermuteUnique1() {
    int[] nums = {1, 1, 2};

    for (List<Integer> integers : permutationsII.permuteUnique(nums)) {
      System.out.println(integers);
    }

    List<List<Integer>> expectedList = new ArrayList<>();

    List<Integer> tempList = new ArrayList<>();
    tempList.add(1);
    tempList.add(1);
    tempList.add(2);
    expectedList.add(new ArrayList<>(tempList));

    tempList.clear();
    tempList.add(1);
    tempList.add(2);
    tempList.add(1);
    expectedList.add(new ArrayList<>(tempList));

    tempList.clear();
    tempList.add(2);
    tempList.add(1);
    tempList.add(1);
    expectedList.add(new ArrayList<>(tempList));

    assertEquals(expectedList, permutationsII.permuteUnique(nums));
  }

  @Test
  void testPermuteUnique2() {
    int[] nums = {1, 0};

    List<List<Integer>> expectedList = new ArrayList<>();

    List<Integer> tempList = new ArrayList<>();
    tempList.add(0);
    tempList.add(1);
    expectedList.add(new ArrayList<>(tempList));

    tempList.clear();
    tempList.add(1);
    tempList.add(0);
    expectedList.add(new ArrayList<>(tempList));

    assertEquals(expectedList, permutationsII.permuteUnique(nums));
  }
}