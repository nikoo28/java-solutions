package hackerrank.algorithms.implementation;

/**
 * Created by nikoo28 on 3/14/21 6:30 PM
 */

public class NumberLineJumps {

  String kangaroo(int x1, int v1, int x2, int v2) {

    if (v1 <= v2)
      return "NO";

    if ((x2 - x1) % (v1 - v2) == 0)
      return "YES";
    else
      return "NO";
  }

}
