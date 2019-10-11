package leetcode;

/**
 * Created by nikoo28 on 12/16/17 10:43 PM
 */

class BinaryNumberWithAlternatingBits {

  public boolean hasAlternatingBits(int n) {

    if (n == 0)
      return true;

    int prev = n % 2;
    n = n / 2;

    while (n > 0) {

      int x = n % 2;
      if (x == prev)
        return false;
      else
        prev = x;

      n = n / 2;
    }

    return true;

  }

}
