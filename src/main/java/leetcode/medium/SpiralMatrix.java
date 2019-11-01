package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nikoo28 on 2019-08-24 16:45
 */

class SpiralMatrix {

  private List<Integer> spiralOrder(int[][] matrix) {

    List<Integer> result = new ArrayList<>();

    if (matrix.length == 0)
      return result;

    int colStart = 0;
    int colEnd = matrix[0].length - 1;
    int rowStart = 0;
    int rowEnd = matrix.length - 1;

    while (colStart <= colEnd && rowStart <= rowEnd) {
      if (colStart == colEnd && rowStart == rowEnd) {
        result.add(matrix[colStart][colEnd]);
        break;
      }

      if (rowStart == rowEnd) {
        for (int i = colStart; i <= colEnd; i++) {
          result.add(matrix[rowStart][i]);
        }
        break;
      }

      if (colStart == colEnd) {
        for (int i = rowStart; i <= rowEnd; i++) {
          result.add(matrix[i][colStart]);
        }
        break;
      }
      result.addAll(getSpiral(matrix, colStart++, colEnd--, rowStart++, rowEnd--));
    }

    return result;
  }

  private List<Integer> getSpiral(int[][] matrix, int colStart, int colEnd, int rowStart, int rowEnd) {

    List<Integer> spiral = new ArrayList<>();

    // Add top row
    for (int i = colStart; i < colEnd; i++) spiral.add(matrix[rowStart][i]);

    // Add last column
    for (int i = rowStart; i < rowEnd; i++) spiral.add(matrix[i][colEnd]);

    // Add last row
    for (int i = colEnd; i > colStart; i--) spiral.add(matrix[rowEnd][i]);

    // Add first column
    for (int i = rowEnd; i > rowStart; i--) spiral.add(matrix[i][colStart]);

    return spiral;
  }

  public static void main(String[] args) {

    SpiralMatrix spiralMatrix = new SpiralMatrix();

    int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
    System.out.println(spiralMatrix.spiralOrder(matrix));

    matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    System.out.println(spiralMatrix.spiralOrder(matrix));

    matrix = new int[][]{{1,2,3,4}};
    System.out.println(spiralMatrix.spiralOrder(matrix));

    matrix = new int[][]{{1,2,3,4}, {5,6,7,8}};
    System.out.println(spiralMatrix.spiralOrder(matrix));
  }

}
