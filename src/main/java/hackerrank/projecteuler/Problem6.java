package hackerrank.projecteuler;

import java.util.Scanner;

class Problem6 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for (int a0 = 0; a0 < t; a0++) {
      int n = in.nextInt();

      long answer = n * (n - 1) * (n + 1) * (3 * n + 2) / 12;
      System.out.println(answer);
    }

  }

}
