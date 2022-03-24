package leetcode.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class SubsetsIITest {

  private final SubsetsII subsetsII;

  SubsetsIITest() {
    subsetsII = new SubsetsII();
  }

  @Test
  void testSubsetsWithDup1() {
    int[] nums = {1, 2, 2};
    List<List<Integer>> expectedList = new ArrayList<>();

    for (List<Integer> subset : subsetsII.subsetsWithDup(nums)) {
      System.out.println(subset);
    }

  }
}