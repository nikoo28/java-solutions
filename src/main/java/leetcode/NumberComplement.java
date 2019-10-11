package leetcode;

/**
 * @author nikoo28 on 9/10/17
 */
class NumberComplement {

  public int findComplement(int num) {
    int i = 0;
    int j = 0;

    while (i < num) {
      i += Math.pow(2, j);
      j++;
    }

    return i - num;
  }

}
