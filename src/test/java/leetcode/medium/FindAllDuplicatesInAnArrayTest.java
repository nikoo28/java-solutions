package leetcode.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 2/6/21 7:02 PM
 */

class FindAllDuplicatesInAnArrayTest {

  private FindAllDuplicatesInAnArray findAllDuplicatesInAnArray;

  public FindAllDuplicatesInAnArrayTest() {
    findAllDuplicatesInAnArray = new FindAllDuplicatesInAnArray();
  }

  @Test
  void testFindDuplicates1() {
    int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

    List<Integer> resultSet = new ArrayList<>();
    resultSet.add(2);
    resultSet.add(3);
    Collections.sort(resultSet);

    assertTrue(resultSet.containsAll(findAllDuplicatesInAnArray.findDuplicatesConstantSpace(nums)));
    assertTrue(resultSet.containsAll(findAllDuplicatesInAnArray.findDuplicatesLinearSpace(nums)));
  }

  @Test
  void testFindDuplicates2() {
    int[] nums = {1, 1};

    List<Integer> resultSet = new ArrayList<>();
    resultSet.add(1);
    Collections.sort(resultSet);

    assertTrue(resultSet.containsAll(findAllDuplicatesInAnArray.findDuplicatesConstantSpace(nums)));
    assertTrue(resultSet.containsAll(findAllDuplicatesInAnArray.findDuplicatesLinearSpace(nums)));
  }

  @Test
  void testFindDuplicates3() {
    int[] nums = {1, 2};

    List<Integer> resultSet = new ArrayList<>();
    Collections.sort(resultSet);

    assertTrue(resultSet.containsAll(findAllDuplicatesInAnArray.findDuplicatesConstantSpace(nums)));
    assertTrue(resultSet.containsAll(findAllDuplicatesInAnArray.findDuplicatesLinearSpace(nums)));
  }
}