package leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindAllNumbersDisappearedInAnArrayTest {

  private final FindAllNumbersDisappearedInAnArray findAllNumbersDisappearedInAnArray;

  FindAllNumbersDisappearedInAnArrayTest() {
    findAllNumbersDisappearedInAnArray = new FindAllNumbersDisappearedInAnArray();
  }

  @Test
  void testFindDisappearedNumbers1() {
    int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
    List<Integer> expected = new ArrayList<>();

    expected.add(5);
    expected.add(6);

    assertEquals(expected, findAllNumbersDisappearedInAnArray.findDisappearedNumbers(arr));
  }

  @Test
  void testFindDisappearedNumbers2() {
    int[] arr = {1, 1};
    List<Integer> expected = new ArrayList<>();

    expected.add(2);

    assertEquals(expected, findAllNumbersDisappearedInAnArray.findDisappearedNumbers(arr));
  }

  @Test
  void testFindDisappearedNumbers() {
    int[] arr = {2, 2};
    List<Integer> expected = new ArrayList<>();

    expected.add(1);

    assertEquals(expected, findAllNumbersDisappearedInAnArray.findDisappearedNumbers(arr));
  }

  @Test
  void testFindDisappearedNumbers3() {
    int[] arr = {1, 2, 3};
    List<Integer> expected = new ArrayList<>();

    assertEquals(expected, findAllNumbersDisappearedInAnArray.findDisappearedNumbers(arr));
  }
}