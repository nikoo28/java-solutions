package leetcode.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

  private final Triangle triangle;

  TriangleTest() {
    triangle = new Triangle();
  }

  @Test
  void testMinimumTotal1() {
    List<Integer> level1 = new ArrayList<>();
    List<Integer> level2 = new ArrayList<>();
    List<Integer> level3 = new ArrayList<>();
    List<Integer> level4 = new ArrayList<>();

    level1.add(2);

    level2.add(3);
    level2.add(4);

    level3.add(6);
    level3.add(5);
    level3.add(7);

    level4.add(4);
    level4.add(1);
    level4.add(8);
    level4.add(3);

    List<List<Integer>> triangleList = new ArrayList<>();
    triangleList.add(level1);
    triangleList.add(level2);
    triangleList.add(level3);
    triangleList.add(level4);

    assertEquals(11, triangle.minimumTotal(triangleList));
  }

  @Test
  void testMinimumTotal2() {
    List<Integer> level1 = new ArrayList<>();
    List<Integer> level2 = new ArrayList<>();
    List<Integer> level3 = new ArrayList<>();
    List<Integer> level4 = new ArrayList<>();

    level1.add(2);

    level2.add(1);
    level2.add(3);

    level3.add(8);
    level3.add(9);
    level3.add(1);

    level4.add(4);
    level4.add(1);
    level4.add(8);
    level4.add(3);

    List<List<Integer>> triangleList = new ArrayList<>();
    triangleList.add(level1);
    triangleList.add(level2);
    triangleList.add(level3);
    triangleList.add(level4);

    assertEquals(9, triangle.minimumTotal(triangleList));
  }

  @Test
  void testMinimumTotal3() {
    List<Integer> level1 = new ArrayList<>();
    level1.add(-10);

    List<List<Integer>> triangleList = new ArrayList<>();
    triangleList.add(level1);

    assertEquals(-10, triangle.minimumTotal(triangleList));
  }
}