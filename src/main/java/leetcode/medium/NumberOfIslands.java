package leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {

  int numIslands(char[][] grid) {
    if (grid == null || grid.length == 0 || grid[0].length == 0) {
      return 0;
    }

    int count = 0;

    for (int i = 0; i < grid.length; i++)
      for (int j = 0; j < grid[0].length; j++)
        if (grid[i][j] == '1') {
          dfs(grid, i, j);
          count++;
        }

    return count;
  }

  private void dfs(char[][] grid, int i, int j) {
    if (i < 0 || i >= grid.length
        || j < 0 || j >= grid[0].length
        || grid[i][j] == '0') {
      return;
    }

    grid[i][j] = '0'; // Mark the cell as visited

    // Explore all four directions
    dfs(grid, i + 1, j);
    dfs(grid, i - 1, j);
    dfs(grid, i, j + 1);
    dfs(grid, i, j - 1);
  }

  int numIslandsBFS(char[][] grid) {
    if (grid == null || grid.length == 0) return 0;

    int rows = grid.length;
    int cols = grid[0].length;
    int islands = 0;
    int[][] directions = { {0, 1}, {1, 0}, {0, -1}, {-1, 0} }; // Right, Down, Left, Up

    for (int r = 0; r < rows; r++) {
      for (int c = 0; c < cols; c++) {
        if (grid[r][c] == '1') { // Found an island
          islands++;
          bfs(grid, r, c, directions);
        }
      }
    }
    return islands;
  }

  private void bfs(char[][] grid, int r, int c, int[][] directions) {
    int rows = grid.length;
    int cols = grid[0].length;
    Queue<int[]> queue = new LinkedList<>();
    queue.offer(new int[] {r, c});
    grid[r][c] = '0'; // Mark as visited

    while (!queue.isEmpty()) {
      int[] current = queue.poll();
      int row = current[0];
      int col = current[1];

      for (int[] dir : directions) {
        int newRow = row + dir[0];
        int newCol = col + dir[1];

        if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && grid[newRow][newCol] == '1') {
          queue.offer(new int[] {newRow, newCol});
          grid[newRow][newCol] = '0'; // Mark as visited
        }
      }
    }
  }
}
