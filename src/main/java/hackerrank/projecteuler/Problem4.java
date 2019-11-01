package hackerrank.projecteuler;

import java.util.Scanner;

class Problem4 {

  private static int check(String s) {
    int len = s.length();
    for (int i = 0; i < len / 2; i++) {
      if (s.charAt(i) != s.charAt(len - 1 - i)) return 0;
    }
    return 1;
  }

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int[] a = new int[1000001];
    int k = 0, count = 0;

    for (int i = 100; i <= 999; i++) {

      for (int j = 100; j <= 999; j++) {

        int pro = i * j;
        if (pro >= 101101) {

          int val = check("" + pro);
          if (val == 1) a[pro] = 1;
        } else
          a[pro] = 0;
      }
    }

    int t = in.nextInt();

    for (int a0 = 0; a0 < t; a0++) {
      int n = in.nextInt();

      for (int i = n - 1; i >= 101101; i--) {

        if (a[i] == 1) {
          System.out.println(i);
          break;
        }
      }
    }
  }
}
