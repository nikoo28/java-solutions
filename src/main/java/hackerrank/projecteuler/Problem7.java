package hackerrank.projecteuler;

import java.util.Scanner;

class Problem7 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    int[] store = new int[T];

    int j, max = 0;

    for (int i = 0; i < T; i++) {
      j = sc.nextInt();
      store[i] = j - 1;
      if (j > max)
        max = j;
    }

    int[] primeChecker = new int[max];
    int[] primeNumbers = new int[max];
    int end = 1;

    primeChecker[0] = 2;
    primeNumbers[0] = 2;

    primeNumbers = findPrime(primeChecker, primeNumbers, end, max);

    for (int i = 0; i < T; i++) {
      System.out.println(primeNumbers[store[i]]);
    }
  }

  private static int[] findPrime(int[] primeChecker, int[] primeNumbers, int end, int size) {
    int i = 2;
    boolean cond;
    while (end < size) {
      i++;
      cond = true;

      for (int j = 0; j < end; j++) {
        primeChecker[j]--;
        if (primeChecker[j] == 0) {
          primeChecker[j] = primeNumbers[j];
          cond = false;
        }
      }

      if (cond) {
        primeChecker[end] = i;
        primeNumbers[end] = i;
        end++;
      }
    }

    return primeNumbers;
  }

}