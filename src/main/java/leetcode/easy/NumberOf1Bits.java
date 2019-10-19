package leetcode.easy;

/**
 * Created by nikoo28 on 10/19/19 3:36 PM
 */

class NumberOf1Bits {

  int hammingWeight(int n) {
    int ones = 0;
    while (n != 0) {
      ones = ones + (n & 1);
      n = n >>> 1;
    }
    return ones;
  }

}
