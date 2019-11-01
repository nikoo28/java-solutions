package leetcode;

/**
 * Created by nikoo28 on 12/17/17 3:10 AM
 */

class FloodFill {

  private int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
    if (image[sr][sc] == newColor) return image;
    fill(image, sr, sc, image[sr][sc], newColor);
    return image;
  }

  private void fill(int[][] image, int sr, int sc, int color, int newColor) {
    if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != color) return;
    image[sr][sc] = newColor;
    fill(image, sr + 1, sc, color, newColor);
    fill(image, sr - 1, sc, color, newColor);
    fill(image, sr, sc + 1, color, newColor);
    fill(image, sr, sc - 1, color, newColor);
  }

  public static void main(String[] args) {
    int[][] grid = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
    int[][] ints = new FloodFill().floodFill(grid, 1, 1, 2);
    for (int[] anInt : ints) {
      for (int j = 0; j < ints[0].length; j++) {
        System.out.print(anInt[j]);
      }
      System.out.println();
    }
  }

}
