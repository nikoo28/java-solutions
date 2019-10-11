package leetcode.easy;

/**
 * Created by nikoo28 on 2019-07-21 12:27
 */

class CountPrimes {
  public int countPrimes(int n) {
    boolean[] notPrime = new boolean[n];
    int count = 0;
    for (int i = 2; i < n; i++) {
      if (!notPrime[i]) {
        count++;
        for (int j = 2; i * j < n; j++) {
          notPrime[i * j] = true;
        }
      }
    }

    return count;
  }
}
