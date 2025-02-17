package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfIslandsTest {

  private final NumberOfIslands numberOfIslands;

  NumberOfIslandsTest() {
    numberOfIslands = new NumberOfIslands();
  }

  @Test
  void testNumIslands1() {
    char[][] grid = {
        {'1', '1', '0', '0', '0'},
        {'1', '1', '0', '0', '0'},
        {'0', '0', '1', '0', '0'},
        {'0', '0', '0', '1', '1'}
    };
    assertEquals(3, numberOfIslands.numIslands(grid));

    grid = new char[][]{
        {'1', '1', '0', '0', '0'},
        {'1', '1', '0', '0', '0'},
        {'0', '0', '1', '0', '0'},
        {'0', '0', '0', '1', '1'}
    };
    assertEquals(3, numberOfIslands.numIslandsBFS(grid));
  }

  @Test
  void testNumIslands2() {
    char[][] grid = {
        {'1', '1', '1', '1', '0'},
        {'1', '1', '0', '1', '0'},
        {'1', '1', '0', '0', '0'},
        {'0', '0', '0', '0', '0'}
    };
    assertEquals(1, numberOfIslands.numIslands(grid));

    grid = new char[][]{
        {'1', '1', '1', '1', '0'},
        {'1', '1', '0', '1', '0'},
        {'1', '1', '0', '0', '0'},
        {'0', '0', '0', '0', '0'}
    };
    assertEquals(1, numberOfIslands.numIslandsBFS(grid));
  }

  @Test
  void testNumIslands3() {
    char[][] grid = {
        {'1'}
    };
    assertEquals(1, numberOfIslands.numIslands(grid));

    grid = new char[][]{
        {'1'}
    };
    assertEquals(1, numberOfIslands.numIslandsBFS(grid));
  }

  @Test
  void testNumIslands4() {
    char[][] grid = {
        {'0', '0', '0'},
        {'0', '0', '0'},
        {'0', '0', '0'}
    };
    assertEquals(0, numberOfIslands.numIslands(grid));

    grid = new char[][]{
        {'0', '0', '0'},
        {'0', '0', '0'},
        {'0', '0', '0'}
    };
    assertEquals(0, numberOfIslands.numIslandsBFS(grid));
  }

  @Test
  void testNumIslands5() {
    char[][] grid = {
        {'1', '0', '1', '0'},
        {'0', '1', '0', '1'},
        {'1', '0', '1', '0'}
    };
    assertEquals(6, numberOfIslands.numIslands(grid));

    grid = new char[][]{
        {'1', '0', '1', '0'},
        {'0', '1', '0', '1'},
        {'1', '0', '1', '0'}
    };
    assertEquals(6, numberOfIslands.numIslandsBFS(grid));
  }
}