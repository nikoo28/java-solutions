package leetcode;

import java.util.HashMap;

/**
 * Created by nikoo28 on 9/22/18 5:17 PM
 */

class FindAnagramMappings {

  public int[] anagramMappings(int[] A, int[] B) {

    HashMap<Integer, Integer> integerLocationMap = new HashMap<>();

    for (int i = 0; i < A.length; i++) {
      integerLocationMap.put(A[i], i);
    }

    int[] P = new int[A.length];
    for (int i = 0; i < B.length; i++) {
      P[i] = integerLocationMap.get(B[i]);
    }

    return P;
  }

}
