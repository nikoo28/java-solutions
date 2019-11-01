package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nikoo28 on 12/16/17 2:08 PM
 */

class FindComplement {

  public int findComplement(int num) {

    List<Integer> binary = new ArrayList<>();
    while (num > 0) {
      binary.add(num % 2 == 0 ? 1 : 0);
      num /= 2;
    }

    int complement = 0;
    int counter = 0;

    for (Integer bin : binary) {
      complement += (Math.pow(2, counter++) * bin);
    }

    return complement;
  }

}
