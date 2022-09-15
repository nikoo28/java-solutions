package hackerrank.algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 3/14/21 7:07 PM
 */

class NumberLineJumpsTest {

  private final NumberLineJumps numberLineJumps;

  public NumberLineJumpsTest() {
    numberLineJumps = new NumberLineJumps();
  }

  @Test
  void testNumberLineJumps1(){
    int x1 = 0;
    int v1 = 2;
    int x2 = 5;
    int v2 = 3;

    assertEquals("NO", numberLineJumps.kangaroo(x1, v1, x2, v2));
  }

  @Test
  void testNumberLineJumps2(){
    int x1 = 0;
    int v1 = 3;
    int x2 = 4;
    int v2 = 2;

    assertEquals("YES", numberLineJumps.kangaroo(x1, v1, x2, v2));
  }

  @Test
  void testNumberLineJumps3(){
    int x1 = 14;
    int v1 = 4;
    int x2 = 98;
    int v2 = 2;

    assertEquals("YES", numberLineJumps.kangaroo(x1, v1, x2, v2));
  }

  @Test
  void testNumberLineJumps4(){
    int x1 = 43;
    int v1 = 2;
    int x2 = 70;
    int v2 = 2;

    assertEquals("NO", numberLineJumps.kangaroo(x1, v1, x2, v2));
  }
}