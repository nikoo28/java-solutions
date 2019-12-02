package leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by nikoo28 on 11/2/19 6:24 PM
 */

class Tuple {

  int currentSize;
  boolean allSame;
  char firstCharacter;

  Tuple(int current, boolean allSame) {
    this.currentSize = current;
    this.allSame = allSame;
  }
}

class TicTacToe {

  private List<Tuple> rows;
  private List<Tuple> cols;
  private Tuple leftDiagonal;
  private Tuple rightDiagonal;
  private int gridSize;

  /**
   * Initialize your data structure here.
   */
  TicTacToe(int n) {

    rows = new ArrayList<>(n);
    cols = new ArrayList<>(n);

    IntStream.range(0, n).forEach(i -> {
      rows.add(new Tuple(0, false));
      cols.add(new Tuple(0, false));
    });

    leftDiagonal = new Tuple(0, false);
    rightDiagonal = new Tuple(0, false);

    gridSize = n;
  }

  /**
   * Player {player} makes a move at ({row}, {col}).
   *
   * @param row    The row of the board.
   * @param col    The column of the board.
   * @param player The player, can be either 1 or 2.
   * @return The current winning condition, can be either:
   * 0: No one wins.
   * 1: Player 1 wins.
   * 2: Player 2 wins.
   */
  int move(int row, int col, int player) {

    char c = player == 1 ? 'X' : 'O';

    Tuple rowNumber = rows.get(row);
    Tuple colNumber = cols.get(col);

    processTuple(rowNumber, c);
    processTuple(colNumber, c);

    // Handle left diagonal
    if (row == col) processTuple(leftDiagonal, c);

    // Handle right diagonal
    if (row + col == gridSize - 1) processTuple(rightDiagonal, c);

    return checkResult(player, gridSize);
  }

  private void processTuple(Tuple tuple, char playedCharacter) {
    tuple.currentSize++;
    if (tuple.currentSize == 1) {
      tuple.firstCharacter = playedCharacter;
      tuple.allSame = true;
    } else if (playedCharacter != tuple.firstCharacter) {
      tuple.allSame = false;
    }
  }

  private int checkResult(int player, int gridSize) {

    for (Tuple row : rows) {
      if (row.currentSize == gridSize && row.allSame) return player;
    }

    for (Tuple col : cols) {
      if (col.currentSize == gridSize && col.allSame) return player;
    }

    if (leftDiagonal.currentSize == gridSize && leftDiagonal.allSame) return player;

    if (rightDiagonal.currentSize == gridSize && rightDiagonal.allSame) return player;

    return 0;
  }
}

/*
  Your TicTacToe object will be instantiated and called as such:
  TicTacToe obj = new TicTacToe(n);
  int param_1 = obj.move(row,col,player);
 */
