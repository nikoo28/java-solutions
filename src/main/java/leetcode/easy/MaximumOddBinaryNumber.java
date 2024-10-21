package leetcode.easy;

public class MaximumOddBinaryNumber {

  String maximumOddBinaryNumber(String s) {

    // Count total 0's and 1's in string
    int countZero = 0;
    int countOne = 0;
    for (char c : s.toCharArray()) {
      if (c == '0')
        countZero++;
      else
        countOne++;
    }

    // Build the answer
    StringBuilder ans = new StringBuilder();

    // Add the first 1
    ans.append("1");
    countOne--;

    // Add all the 0's
    ans.append("0".repeat(countZero));

    // Add the remaining 1's
    ans.append("1".repeat(countOne));

    // Reverse and return the answer
    return ans.reverse().toString();
  }

}
