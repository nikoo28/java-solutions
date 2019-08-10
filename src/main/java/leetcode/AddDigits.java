package leetcode;

/**
 * @author nikoo28 on 9/17/17
 */
public class AddDigits {

  public int addDigits(int num) {
    return 1 + (num - 1) % 9;
  }
}
