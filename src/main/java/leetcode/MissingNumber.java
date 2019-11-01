package leetcode;

/**
 * Created by nikoo28 on 9/23/18 1:15 PM
 */

class MissingNumber {

  public int missingNumber(int[] nums) {

    double sum = (nums.length * (nums.length + 1))/2;

    for (int num : nums) {
      sum -= num;
    }

    return (int)sum;
  }

}
