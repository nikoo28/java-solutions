package leetcode;

/**
 * @author nikoo28 on 9/10/17
 */
class IslandPerimeter {

  public int islandPerimeter(int[][] grid) {

    int rows = grid.length + 2;
    int cols = grid[0].length + 2;

    int[][] matrix = new int[rows][cols];

    for (int i = 1; i < rows - 1; i++) {
      System.arraycopy(grid[i - 1], 0, matrix[i], 1, cols - 1 - 1);
    }

    int perimeter = 0;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (matrix[i][j] == 1) {
          int waterSides = calculateWaterBoundaries(i, j, matrix);
          perimeter += waterSides;
        }
      }
    }

    return perimeter;
  }

  private int calculateWaterBoundaries(int i, int j, int[][] matrix) {

    int sides = 0;

    if (matrix[i - 1][j] == 0)
      sides++;

    if (matrix[i + 1][j] == 0)
      sides++;

    if (matrix[i][j + 1] == 0)
      sides++;

    if (matrix[i][j - 1] == 0)
      sides++;

    return sides;
  }

}
