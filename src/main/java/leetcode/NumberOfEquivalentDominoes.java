package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by nikoo28 on 2019-07-20 19:32
 */

class NumberOfEquivalentDominoes {

  public int numEquivDominoPairs(int[][] dominoes) {

    Map<List<Integer>, Integer> uniqueDominoes = new HashMap<>();

    for (int[] dominoe : dominoes) {
      Arrays.sort(dominoe);
      List<Integer> domino = Arrays.stream(dominoe).boxed().collect(Collectors.toList());
      if (uniqueDominoes.containsKey(domino)) {
        uniqueDominoes.put(domino, (uniqueDominoes.get(domino) + 1));
      } else
        uniqueDominoes.put(domino, 1);
    }

    int result = 0;

    for (Map.Entry<List<Integer>, Integer> listIntegerEntry : uniqueDominoes.entrySet()) {
      if (listIntegerEntry.getValue() > 1) {
        int n = listIntegerEntry.getValue();
        result += (n * (n - 1)) / 2;
      }
    }

    return result;
  }

}
