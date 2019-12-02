package leetcode.medium;

import java.util.HashSet;

/**
 * Created by nikoo28 on 11/3/19 2:10 AM
 */

class ValidSudoku {

  /**
   * Each row must contain the digits 1-9 without repetition.
   * Each column must contain the digits 1-9 without repetition.
   * Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.
   */
  boolean isValidSudoku(char[][] board) {
    for (int i = 0; i < 9; i++) {

      HashSet<Character> rows = new HashSet<>();
      HashSet<Character> columns = new HashSet<>();
      HashSet<Character> cube = new HashSet<>();

      for (int j = 0; j < 9; j++) {
        if (board[i][j] != '.' && !rows.add(board[i][j]))
          return false;
        if (board[j][i] != '.' && !columns.add(board[j][i]))
          return false;

        int RowIndex = 3 * (i / 3);
        int ColIndex = 3 * (i % 3);

        if (board[RowIndex + j / 3][ColIndex + j % 3] != '.' &&
            !cube.add(board[RowIndex + j / 3][ColIndex + j % 3]))
          return false;
      }
    }
    return true;
  }

}
