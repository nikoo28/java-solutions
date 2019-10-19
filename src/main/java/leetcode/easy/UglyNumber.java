package leetcode.easy;

/**
 * Created by nikoo28 on 10/19/19 3:21 PM
 */

public class UglyNumber {

  public boolean isUgly(int num) {
    if (num == 1) return true;
    if (num == 0) return false;
    while (num % 2 == 0) num = num >> 1;
    while (num % 3 == 0) num = num / 3;
    while (num % 5 == 0) num = num / 5;
    return num == 1;
  }

}
