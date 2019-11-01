package hackerrank.projecteuler;

import java.util.Scanner;

/**
 * Created by nikhil.lohia on 08/04/2017.
 */
class Problem2 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for (int a0 = 0; a0 < t; a0++) {
      long n = in.nextLong();
      System.out.println(solve(n));
    }
  }

  private static long solve(long n) {
    long sum = 0;
    long a = 1;
    long b = 2;
    long temp = 0;
    while (temp < n) {
      if (b % 2 == 0) {
        sum += b;
      }
      temp = a + b;
      a = b;
      b = temp;
    }
    return sum;
  }
}
