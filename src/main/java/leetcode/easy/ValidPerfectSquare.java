package leetcode.easy;

public class ValidPerfectSquare {

  boolean isPerfectSquareBinary(int num) {
    if (num < 0) return false; // Negative numbers cannot be perfect squares
    if (num == 0 || num == 1) return true; // 0 and 1 are perfect squares

    long left = 1, right = num;

    while (left <= right) {
      long mid = left + (right - left) / 2;
      long square = mid * mid;

      if (square == num) {
        return true; // Found the perfect square
      } else if (square < num) {
        left = mid + 1; // Search in the right half
      } else {
        right = mid - 1; // Search in the left half
      }
    }

    return false; // No perfect square found
  }

  boolean isPerfectSquareMaths(int num) {
    int oddNumber = 1;
    int sum = 1;
    while (sum <= num) {
      // Found the perfect square
      if (sum == num) {
        return true;
      }

      oddNumber += 2; // Next odd number
      sum += oddNumber;
    }

    return false;
  }

}
