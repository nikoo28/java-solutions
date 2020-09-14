package hackerrank.datastructures.stacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 9/13/20 8:40 PM
 */

class EqualStacksTest {

  EqualStacks equalStacks = new EqualStacks();

  @Test
  void testEqualStacks1() {
    int[] h1 = {3, 2, 1, 1, 1};
    int[] h2 = {4, 3, 2};
    int[] h3 = {1, 1, 4, 1};

    assertEquals(5, equalStacks.equalStacks(h1, h2, h3));
  }

  @Test
  void testEqualStacks2() {
    int[] h1 = {3, 2, 1, 1, 1};
    int[] h2 = {2};
    int[] h3 = {1, 1, 4, 1};

    assertEquals(0, equalStacks.equalStacks(h1, h2, h3));
  }

  @Test
  void testEqualStacks3() {
    int[] h1 = {1};
    int[] h2 = {1};
    int[] h3 = {1};

    assertEquals(1, equalStacks.equalStacks(h1, h2, h3));
  }

  @Test
  void testEqualStacks4() {
    int[] h1 = {1, 1, 1, 1, 1};
    int[] h2 = {3, 2};
    int[] h3 = {1, 3, 1};

    assertEquals(5, equalStacks.equalStacks(h1, h2, h3));
  }

  @Test
  void testEqualStacks5() {
    int[] h1 = {1, 1, 4, 1, 1, 6, 7, 2, 1, 6, 2, 1};
    int[] h2 = {3, 2, 6, 7, 1, 2, 1, 1, 2, 5, 1};
    int[] h3 = {1, 3, 1, 6, 2, 1, 6, 7, 1, 2, 4, 8, 1};

    assertEquals(9, equalStacks.equalStacks(h1, h2, h3));
  }
}