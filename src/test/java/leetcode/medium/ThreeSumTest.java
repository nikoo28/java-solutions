package leetcode.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {

  private final ThreeSum threeSum;

  ThreeSumTest() {
    threeSum = new ThreeSum();
  }

  @Test
  void testThreeSum1() {
    int[] nums = {-1, 0, 1, 2, -1, -4};
    List<List<Integer>> expectedList = new ArrayList<>();
    List<Integer> list1 = new ArrayList<>();
    list1.add(-1);
    list1.add(-1);
    list1.add(2);

    List<Integer> list2 = new ArrayList<>();
    list2.add(-1);
    list2.add(0);
    list2.add(1);

    expectedList.add(list1);
    expectedList.add(list2);

    List<List<Integer>> actualList = threeSum.threeSum(nums);
    assertEquals(expectedList, actualList);
  }

  @Test
  void testThreeSum2() {
    int[] nums = {0, 1, 1};
    List<List<Integer>> expectedList = new ArrayList<>();

    List<List<Integer>> actualList = threeSum.threeSum(nums);
    assertEquals(expectedList, actualList);
  }

  @Test
  void testThreeSum3() {
    int[] nums = {0, 0, 0};
    List<List<Integer>> expectedList = new ArrayList<>();
    List<Integer> list1 = new ArrayList<>();
    list1.add(0);
    list1.add(0);
    list1.add(0);

    expectedList.add(list1);

    List<List<Integer>> actualList = threeSum.threeSum(nums);
    assertEquals(expectedList, actualList);
  }
}