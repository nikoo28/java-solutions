package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 11/2/19 9:04 PM
 */

class TicTacToeTest {

  @Test
  void testGrid2() {
    TicTacToe ticTacToe = new TicTacToe(2);

    assertEquals(0, ticTacToe.move(0, 1, 1));
    assertEquals(0, ticTacToe.move(1, 1, 2));
    assertEquals(1, ticTacToe.move(1, 0, 1));
  }

  @Test
  void testGrid3() {
    TicTacToe ticTacToe = new TicTacToe(3);

    assertEquals(0, ticTacToe.move(0, 0, 1));
    assertEquals(0, ticTacToe.move(0, 2, 2));
    assertEquals(0, ticTacToe.move(2, 2, 1));
    assertEquals(0, ticTacToe.move(1, 1, 2));
    assertEquals(0, ticTacToe.move(2, 0, 1));
    assertEquals(0, ticTacToe.move(1, 0, 2));
    assertEquals(1, ticTacToe.move(2, 1, 1));
  }

  @Test
  void testGrid4() {
    TicTacToe ticTacToe = new TicTacToe(4);

    assertEquals(0, ticTacToe.move(0, 0, 1));
    assertEquals(0, ticTacToe.move(0, 2, 2));
    assertEquals(0, ticTacToe.move(2, 2, 1));
    assertEquals(0, ticTacToe.move(1, 1, 2));
    assertEquals(0, ticTacToe.move(2, 0, 1));
    assertEquals(0, ticTacToe.move(1, 0, 2));
    assertEquals(0, ticTacToe.move(2, 1, 1));
    assertEquals(0, ticTacToe.move(3, 3, 2));
    assertEquals(0, ticTacToe.move(0, 3, 1));
    assertEquals(0, ticTacToe.move(1, 3, 2));
    assertEquals(1, ticTacToe.move(2, 3, 1));
  }

}