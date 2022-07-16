package leetcode.easy;

public class SquaresOfSortedArray {

  int[] sortedSquares(int[] nums) {

    int[] result = new int[nums.length];

    // Square all elements
    for (int i = 0; i < nums.length; i++) {
      nums[i] = nums[i] * nums[i];
    }

    int head = 0;
    int tail = nums.length - 1;

    // Set them at right place in the result array
    for (int pos = nums.length - 1; pos >= 0; pos--) {

      if (nums[head] > nums[tail]) {
        result[pos] = nums[head];
        // Increment head pointer
        head++;
      } else {
        result[pos] = nums[tail];
        // Increment tail pointer
        tail--;
      }
    }

    return result;
  }

}
