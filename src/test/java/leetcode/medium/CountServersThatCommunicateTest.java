package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountServersThatCommunicateTest {

  private final CountServersThatCommunicate countServersThatCommunicate;

  CountServersThatCommunicateTest() {
    countServersThatCommunicate = new CountServersThatCommunicate();
  }

  @Test
  void testCountServers1() {
    int[][] grid = {{1, 0}, {0, 1}};

    assertEquals(0, countServersThatCommunicate.countServers(grid));
  }

  @Test
  void testCountServers2() {
    int[][] grid = {{1, 0}, {1, 1}};

    assertEquals(3, countServersThatCommunicate.countServers(grid));
  }

  @Test
  void testCountServers3() {
    int[][] grid = {{1, 0, 0, 1}, {0, 0, 1, 0}, {0, 0, 0, 1}, {0, 1, 0, 1}, {1, 1, 0, 0}};

    assertEquals(7, countServersThatCommunicate.countServers(grid));
  }
}