package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 11/2/19 9:38 PM
 */

class ValidTicTacToeStateTest {

  ValidTicTacToeState validTicTacToeState = new ValidTicTacToeState();

  @Test
  void validTicTacToe1() {
    String[] board = {"O  ", "   ", "   "};

    assertFalse(validTicTacToeState.validTicTacToe(board));
  }

  @Test
  void validTicTacToe2() {
    String[] board = {"XOX", " X ", "   "};

    assertFalse(validTicTacToeState.validTicTacToe(board));
  }

  @Test
  void validTicTacToe3() {
    String[] board = {"XXX", "   ", "OOO"};

    assertFalse(validTicTacToeState.validTicTacToe(board));
  }

  @Test
  void validTicTacToe4() {
    String[] board = {"XOX", "O O", "XOX"};

    assertTrue(validTicTacToeState.validTicTacToe(board));
  }
}