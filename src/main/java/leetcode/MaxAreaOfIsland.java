package leetcode;

/**
 * Created by nikoo28 on 12/17/17 1:27 AM
 */

class MaxAreaOfIsland {

  private int maxAreaOfIsland(int[][] grid) {

    int index = 2;
    int maxArea = 0;

    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {

        if (grid[i][j] == 0) continue;
        if (grid[i][j] != 1) continue;

        int area = floodFill(grid, i, j, index++, 0);
        maxArea = Math.max(area, maxArea);
      }
    }

    for (int[] ints : grid) {
      for (int j = 0; j < grid[0].length; j++) {
        System.out.print(ints[j] + " ");
      }
      System.out.println();
    }

    return maxArea;
  }

  private static int floodFill(int[][] grid, int i, int j, int val, int area) {

    if (grid[i][j] == 0) return area;
    if (grid[i][j] != 1) return area;

    grid[i][j] = val;
    area++;
    if (i > 0) area = floodFill(grid, i - 1, j, val, area);
    if (j > 0) area = floodFill(grid, i, j - 1, val, area);
    if (i < grid.length - 1) area = floodFill(grid, i + 1, j, val, area);
    if (j < grid[0].length - 1) area = floodFill(grid, i, j + 1, val, area);
    return area;
  }

  public static void main(String[] args) {
    int[][] grid = {{1, 1, 0, 0, 0}, {1, 1, 0, 0, 0}, {0, 0, 0, 1, 1}, {0, 0, 0, 1, 1}};
    System.out.println(new MaxAreaOfIsland().maxAreaOfIsland(grid));
  }

}
