package hackerrank.algorithms.sorting;

import java.util.Scanner;

class InsertionSortPartOne {

  private static void insertIntoSorted(int[] ar) {
    int n = ar.length;
    int insert = ar[n - 1];

    for (int x = n - 1; x >= 0; x--) {
      if (x == 0 && insert <= ar[0]) {
        ar[x] = insert;
        printArray(ar);
      } else if (insert <= ar[x - 1]) {

        ar[x] = ar[x - 1];
        printArray(ar);

      } else if (insert > ar[x - 1] && insert < ar[x + 1]) {
        ar[x] = insert;
        printArray(ar);
      }
    }
  }


  /* Tail starts here */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int s = in.nextInt();
    int[] ar = new int[s];
    for (int i = 0; i < s; i++) {
      ar[i] = in.nextInt();
    }
    insertIntoSorted(ar);
  }


  private static void printArray(int[] ar) {
    for (int n : ar) {
      System.out.print(n + " ");
    }
    System.out.println();
  }


}

