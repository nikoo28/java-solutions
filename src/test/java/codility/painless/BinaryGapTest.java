package codility.painless;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 10/16/19 3:12 AM
 */

class BinaryGapTest {
  
  BinaryGap binaryGap = new BinaryGap();

  @Test
  void testSolution() {
    assertEquals(0, binaryGap.solution(15));
    assertEquals(1, binaryGap.solution(20));
    assertEquals(4, binaryGap.solution(529));
    assertEquals(2, binaryGap.solution(9));
    assertEquals(0, binaryGap.solution(1));
    assertEquals(0, binaryGap.solution(32));
    assertEquals(5, binaryGap.solution(1041));
    assertEquals(0, binaryGap.solution(2147483647));
    
  }
}