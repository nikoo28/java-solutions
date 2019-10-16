package codility.ambitious;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 10/16/19 3:15 AM
 */

class IdenticalPairOfIndicesTest {

  IdenticalPairOfIndices identicalPairOfIndices = new IdenticalPairOfIndices();

  @Test
  void solution() {
    int[] a = {3, 5, 6, 3, 3, 5};

    assertEquals(4, identicalPairOfIndices.solution(a));
  }
}