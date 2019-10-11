package leetcode;

/**
 * @author nikoo28 on 9/10/17
 */
class ReshapeTheMatrix {

  public int[][] matrixReshape(int[][] nums, int r, int c) {
    int m = nums.length, n = nums[0].length;
    if (m * n != r * c) return nums;

    int[][] result = new int[r][c];
    int row = 0, col = 0;
    for (int[] num : nums) {
      for (int j = 0; j < n; j++) {
        result[row][col] = num[j];
        col++;
        if (col == c) {
          col = 0;
          row++;
        }
      }
    }

    return result;
  }

}
