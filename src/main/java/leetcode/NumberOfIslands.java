package leetcode;

/**
 * Created by nikoo28 on 12/18/17 9:40 PM
 */

class NumberOfIslands {

  public int numIslands(char[][] grid) {

    int count = 0;

    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        if (grid[i][j] == '1') {
          explore(grid, i, j);
          count++;
        }
      }
    }

    return count;
  }

  private void explore(char[][] grid, int i, int j) {
    if (i < 0 || j < 0 || j >= grid[0].length || i >= grid.length || grid[i][j] == '0') return;

    grid[i][j] = '0';
    explore(grid, i, j - 1);
    explore(grid, i, j + 1);
    explore(grid, i - 1, j);
    explore(grid, i + 1, j);
  }

}
