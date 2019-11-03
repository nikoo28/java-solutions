package leetcode.medium;

/**
 * Created by nikoo28 on 11/2/19 9:36 PM
 */

public class ValidTicTacToeState {

  public boolean validTicTacToe(String[] board) {

    int turns = 0;
    boolean xwin;
    boolean owin;
    int[] rows = new int[3];
    int[] cols = new int[3];
    int leftDiagonal = 0;
    int rightDiagonal = 0;

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (board[i].charAt(j) == 'X') {
          turns++;
          rows[i]++;
          cols[j]++;
          if (i == j) leftDiagonal++;
          if (i + j == 2) rightDiagonal++;
        } else if (board[i].charAt(j) == 'O') {
          turns--;
          rows[i]--;
          cols[j]--;
          if (i == j) leftDiagonal--;
          if (i + j == 2) rightDiagonal--;
        }
      }
    }

    xwin = rows[0] == 3 || rows[1] == 3 || rows[2] == 3 ||
        cols[0] == 3 || cols[1] == 3 || cols[2] == 3 ||
        leftDiagonal == 3 || rightDiagonal == 3;
    owin = rows[0] == -3 || rows[1] == -3 || rows[2] == -3 ||
        cols[0] == -3 || cols[1] == -3 || cols[2] == -3 ||
        leftDiagonal == -3 || rightDiagonal == -3;

    if (xwin && turns == 0 || owin && turns == 1) {
      return false;
    }
    return turns == 0 || turns == 1;
  }

}
