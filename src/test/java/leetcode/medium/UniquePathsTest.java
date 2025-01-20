package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniquePathsTest {

  private final UniquePaths uniquePaths;

  UniquePathsTest() {
    uniquePaths = new UniquePaths();
  }

  @Test
  void testUniquePaths1() {
    assertEquals(3, uniquePaths.uniquePaths(3, 2));
  }

  @Test
  void testUniquePaths2() {
    assertEquals(28, uniquePaths.uniquePaths(7, 3));
  }

  @Test
  void testUniquePaths3() {
    assertEquals(6, uniquePaths.uniquePaths(3, 3));
  }

  @Test
  void testUniquePaths4() {
    assertEquals(28, uniquePaths.uniquePaths(3, 7));
  }
}
