package leetcode.easy;

import java.util.Arrays;

/**
 * Created by nikoo28 on 12/17/17 3:14 PM
 */

class MajorityElement {

  int majorityElement(int[] num) {

    int majority = num[0], votes = 1;

    for (int i = 1; i < num.length; i++) {

      if (votes == 0) {
        votes++;
        majority = num[i];
      } else if (majority == num[i]) {
        votes++;
      } else
        votes--;

    }
    return majority;
  }

}
