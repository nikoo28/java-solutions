package leetcode.easy;

public class FibonacciNumber {

  int fib(int n) {
    // easy base cases/edge cases
    if (n <= 1) {
      return n;
    }

    // initialize our memoization map
    // size N +1 so that we can accommodate from 0 to N
    int[] map = new int[n + 1];

    // put our base cases
    map[0] = 0;
    map[1] = 1;

    // iterate through remaining values (2...N)
    for (int i = 2; i <= n; i += 1) {
      map[i] = map[i - 1] + map[i - 2];
    }
    return map[n];
  }

}
