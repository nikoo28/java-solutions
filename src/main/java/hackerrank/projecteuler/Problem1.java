package hackerrank.projecteuler;

import java.util.Scanner;

/**
 * Created by nikhil.lohia on 08/03/2017.
 */
class Problem1 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    long t = sc.nextLong();
    for (long i = 0; i < t; i++) {
      long n = sc.nextLong();
      long a, b, d;

      // Here a, b and d are the count of numbers divisible by 3, 5 and 15 respectively
      a = (n - 1) / 3;
      b = (n - 1) / 5;
      d = (n - 1) / 15;

      // To get the sum of all numbers divisible by 3 (sum3) i.e. 3+6+9+-----+3n = 3(1+2+3+---+n) = 3*n(n+1)/2
      // Similarly sum of all numbers divisible by 5 (sum5) is 5*n(n+1)/2
      // Sum of numbers divisible by 15 (sum15) is 15*n(n+1)/2.
      long sum3 = 3 * a * (a + 1) / 2;
      long sum5 = 5 * b * (b + 1) / 2;
      long sum15 = 15 * d * (d + 1) / 2;
      long c = sum3 + sum5 - sum15;
      System.out.println(c);
    }
  }
}