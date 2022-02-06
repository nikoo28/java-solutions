package leetcode.easy;

/**
 * @author nikoo28 on 9/17/17
 */
class MoveZeroes {

  public void moveZeroes(int[] nums) {

    // Start with the first position
    int insertPosition = 0;

    for (int i = 0; i < nums.length; i++) {
      // FIll all non-zero numbers
      if (nums[i] != 0) {
        nums[insertPosition] = nums[i];
        insertPosition++;
      }
    }

    while (insertPosition < nums.length) {
      nums[insertPosition++] = 0;
    }
  }

}
