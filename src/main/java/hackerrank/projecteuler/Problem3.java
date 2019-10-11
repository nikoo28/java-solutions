package hackerrank.projecteuler;

import java.util.Scanner;

/**
 * Created by nikhil.lohia on 08/07/2017.
 */

class Problem3 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int cases = scanner.nextInt();
    for (int i = 0; i < cases; i++) {

      long N = scanner.nextLong();

      long lastFactor = 0;
      while (N % 2 == 0) {
        N /= 2;
        lastFactor = 2;
      }

      for (long j = 3; j <= Math.sqrt(N); j += 2) {
        while (N % j == 0) {
          N /= j;
          lastFactor = j;
        }
      }

      if (N > 2)
        System.out.println(N);
      else
        System.out.println(lastFactor);
    }
  }
}

