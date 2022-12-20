package leetcode;

/**
 * Created by nikoo28 on 9/23/18 1:15 PM
 */

class MissingNumber {

  int missingNumber(int[] nums) {

    int allXOR = 0;

    // XOR all numbers in range [0, n]
    for (int i = 0; i <= nums.length; i++) {
      allXOR = allXOR ^ i;
    }

    // XOR all numbers in the given array
    for (int num : nums) {
      allXOR = allXOR ^ num;
    }

    // The missing number
    return allXOR;
  }

}
