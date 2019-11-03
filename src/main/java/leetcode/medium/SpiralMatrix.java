package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nikoo28 on 2019-08-24 16:45
 */

class SpiralMatrix {

  List<Integer> spiralOrder(int[][] matrix) {

    List<Integer> res = new ArrayList<>();

    if (matrix.length == 0) {
      return res;
    }

    int rowBegin = 0;
    int rowEnd = matrix.length - 1;
    int colBegin = 0;
    int colEnd = matrix[0].length - 1;

    while (rowBegin <= rowEnd && colBegin <= colEnd) {
      // Traverse Right
      for (int j = colBegin; j <= colEnd; j++) {
        res.add(matrix[rowBegin][j]);
      }
      rowBegin++;

      // Traverse Down
      for (int j = rowBegin; j <= rowEnd; j++) {
        res.add(matrix[j][colEnd]);
      }
      colEnd--;

      if (rowBegin <= rowEnd) {
        // Traverse Left
        for (int j = colEnd; j >= colBegin; j--) {
          res.add(matrix[rowEnd][j]);
        }
      }
      rowEnd--;

      if (colBegin <= colEnd) {
        // Traverse Up
        for (int j = rowEnd; j >= rowBegin; j--) {
          res.add(matrix[j][colBegin]);
        }
      }
      colBegin++;
    }

    return res;
  }
}
