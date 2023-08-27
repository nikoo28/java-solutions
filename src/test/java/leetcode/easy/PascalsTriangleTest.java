package leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 10/16/19 2:51 AM
 */

class PascalsTriangleTest {

  private final PascalsTriangle pascalsTriangle;

  PascalsTriangleTest() {
    pascalsTriangle = new PascalsTriangle();
  }

  @Test
  void testGenerate1() {
    List<List<Integer>> expectedResult = new ArrayList<>();

    List<Integer> row1 = new ArrayList<>();
    row1.add(1);
    List<Integer> row2 = new ArrayList<>();
    row2.add(1);
    row2.add(1);
    List<Integer> row3 = new ArrayList<>();
    row3.add(1);
    row3.add(2);
    row3.add(1);
    List<Integer> row4 = new ArrayList<>();
    row4.add(1);
    row4.add(3);
    row4.add(3);
    row4.add(1);
    List<Integer> row5 = new ArrayList<>();
    row5.add(1);
    row5.add(4);
    row5.add(6);
    row5.add(4);
    row5.add(1);

    expectedResult.add(row1);
    expectedResult.add(row2);
    expectedResult.add(row3);
    expectedResult.add(row4);
    expectedResult.add(row5);

    List<List<Integer>> actualResult = pascalsTriangle.generate(5);

    assertEquals(expectedResult, actualResult);
  }
}