package codility.ambitious;

import java.util.*;
import java.util.function.BiFunction;

/**
 * Created by nikoo28 on 2019-08-25 13:39
 */

class IdenticalPairOfIndices {

  int solution(int[] a) {

//    Integer[] indices = new Integer[a.length];
//    for (int i = 0; i < a.length; ++i) {
//      indices[i] = i;
//    }
//
//    Arrays.sort(indices, (i, j) -> {
//      return Integer.compare(a[i], a[j]);
//    });
//
//    int count = 0;
//    int idx = 0;
//    while (idx < indices.length) {
//      int start = idx;
//      while (idx < indices.length && a[indices[idx]] == a[indices[start]]) {
//        idx++;
//      }
//
//      int equalIndices = idx - start;
//      int possiblePairs = equalIndices * (equalIndices - 1) / 2;
//
//      count += possiblePairs;
//    }

//    return count;


    Map<Integer, Long> integerFrequencyMap = new HashMap<>();
    for (int i : a) {
      Integer integer = i;
      integerFrequencyMap.merge(integer, 1L, new BiFunction<Long, Long, Long>() {
        @Override
        public Long apply(Long a1, Long b) {
          return Long.sum(a1, b);
        }
      });
    }

    long count = 0L;
    for (Long e : integerFrequencyMap.values()) {
      long l = e * (e - 1) / 2;
      count += l;
    }

    if (count > 1000000000)
        return 1000000000;
    else
      return (int) count;

    // Store each pair in map
//    LinkedHashMap<Integer, ArrayList<Integer>> keyPair = new LinkedHashMap<>();
//
//    for (int i = 0; i < A.length; i++) {
//
//      if (keyPair.containsKey(A[i])) {
//        keyPair.get(A[i]).add(i);
//      } else {
//        ArrayList<Integer> intList = new ArrayList<>();
//        intList.add(i);
//        keyPair.put(A[i], intList);
//      }
//    }
//
//    // Get pairs
//    long pairs = 0;
//    for (Map.Entry<Integer, ArrayList<Integer>> keyPairEntry : keyPair.entrySet()) {
//      ArrayList<Integer> intList = keyPairEntry.getValue();
//      for (int i = 1; i < intList.size(); i++) {
//        pairs = pairs + i;
//      }
//      if (pairs >= 1000000000) {
//        pairs = 1000000000;
//        break;
//      }
//    }
//
//    return (int) pairs;
  }

}
