package leetcode.medium;

public class SumOfSquareNumbers {

  boolean judgeSquareSum(int c) {

    // Base case
    if (c < 0) return false;

    // Two pointers
    long left = 0;
    long right = (int) Math.sqrt(c);

    while (left <= right) {
      long sum = left * left + right * right;

      if (sum == c)
        return true;
      else if (sum < c)
        left++;
      else
        right--;
    }

    return false;
  }

}
