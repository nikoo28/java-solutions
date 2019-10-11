package leetcode.medium;

/**
 * Created by nikoo28 on 2019-07-21 14:44
 */

class SearchA2DMatrixII {

  private boolean searchMatrix(int[][] matrix, int target) {

    int row = matrix.length - 1;
    int col = 0;

    while (row >= 0 && col <= matrix[row].length) {

      if (target == matrix[row][col]) return true;
      if (target > matrix[row][col]) col++;
      else row--;
    }

    return false;
  }

  public static void main(String[] args) {
    int[][] matrix = {{-1, 3}};
    SearchA2DMatrixII searchA2DMatrixII = new SearchA2DMatrixII();

    System.out.println(searchA2DMatrixII.searchMatrix(matrix, 3));
  }

}

//1  4  7  11 15
//2  5  8  12 19
//3  6  9  16 22
//10 13 14 17 24
//18 21 23 26 30