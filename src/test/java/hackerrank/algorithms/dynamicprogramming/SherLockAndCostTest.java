package hackerrank.algorithms.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SherLockAndCostTest {

  private final SherLockAndCost sherLockAndCost;

  public SherLockAndCostTest() {
    sherLockAndCost = new SherLockAndCost();
  }

  @Test
  void testSherlockAndCost1() {
    List<Integer> B = new ArrayList<>();
    B.add(10);
    B.add(1);
    B.add(10);
    B.add(1);
    B.add(10);

    assertEquals(36, sherLockAndCost.sherlockAndCostProblem(B));
  }

  @Test
  void testSherlockAndCost2() {
    List<Integer> B = new ArrayList<>();
    B.add(100);
    B.add(2);
    B.add(100);
    B.add(2);
    B.add(100);

    assertEquals(396, sherLockAndCost.sherlockAndCostProblem(B));
  }

  @Test
  void testSherlockAndCost3() {
    List<Integer> B = new ArrayList<>();
    B.add(1);
    B.add(2);
    B.add(3);
    B.add(4);
    B.add(5);

    assertEquals(8, sherLockAndCost.sherlockAndCostProblem(B));
  }
}
