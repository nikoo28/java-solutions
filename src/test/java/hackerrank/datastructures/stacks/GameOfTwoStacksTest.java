package hackerrank.datastructures.stacks;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameOfTwoStacksTest {

  private final GameOfTwoStacks gameOfTwoStacks;

  GameOfTwoStacksTest() {
    gameOfTwoStacks = new GameOfTwoStacks();
  }

  @Test
  void testTwoStacks1() {
    int maxSum = 10;

    List<Integer> a = new ArrayList<>();
    a.add(4);
    a.add(2);
    a.add(4);
    a.add(6);
    a.add(1);

    List<Integer> b = new ArrayList<>();
    b.add(2);
    b.add(1);
    b.add(8);
    b.add(5);

    assertEquals(4, gameOfTwoStacks.twoStacks(maxSum, a, b));
  }

  @Test
  void testTwoStacks2() {
    int maxSum = 62;

    List<Integer> a = new ArrayList<>();
    a.add(7);
    a.add(15);
    a.add(12);
    a.add(0);
    a.add(5);
    a.add(18);
    a.add(17);
    a.add(2);
    a.add(10);
    a.add(15);
    a.add(4);
    a.add(2);
    a.add(9);
    a.add(15);
    a.add(13);
    a.add(12);
    a.add(16);

    List<Integer> b = new ArrayList<>();
    b.add(12);
    b.add(16);
    b.add(6);
    b.add(8);
    b.add(16);
    b.add(15);
    b.add(18);
    b.add(3);
    b.add(11);
    b.add(0);
    b.add(17);
    b.add(7);
    b.add(6);
    b.add(11);
    b.add(14);
    b.add(13);
    b.add(15);
    b.add(6);
    b.add(18);
    b.add(6);
    b.add(16);
    b.add(12);
    b.add(16);
    b.add(11);
    b.add(16);
    b.add(11);

    assertEquals(6, gameOfTwoStacks.twoStacks(maxSum, a, b));
  }

  @Test
  void testTwoStacks3() {
    int maxSum = 12;

    List<Integer> a = new ArrayList<>();
    a.add(1);
    a.add(0);
    a.add(1);
    a.add(1);
    a.add(0);
    a.add(1);
    a.add(1);
    a.add(1);

    List<Integer> b = new ArrayList<>();
    b.add(0);
    b.add(1);
    b.add(1);
    b.add(1);
    b.add(0);
    b.add(1);
    b.add(1);
    b.add(1);
    b.add(1);
    b.add(1);

    assertEquals(16, gameOfTwoStacks.twoStacks(maxSum, a, b));
  }

  @Test
  void testTwoStacks4() {
    int maxSum = 0;

    List<Integer> a = new ArrayList<>();
    a.add(1);

    List<Integer> b = new ArrayList<>();
    b.add(0);

    assertEquals(1, gameOfTwoStacks.twoStacks(maxSum, a, b));
  }

  @Test
  void testTwoStacks5() {
    int maxSum = 0;

    List<Integer> a = new ArrayList<>();
    a.add(1);

    List<Integer> b = new ArrayList<>();
    b.add(1);

    assertEquals(0, gameOfTwoStacks.twoStacks(maxSum, a, b));
  }
}