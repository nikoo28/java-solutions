package hackerrank.projecteuler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Problem5 {

  public static void main(String[] args) {

    List<String> factorList = new ArrayList<>();
    factorList.add("");
    factorList.add("1");
    factorList.add("1,2");
    factorList.add("1,3");
    factorList.add("2,2");
    factorList.add("1,5");
    factorList.add("2,3");
    factorList.add("1,7");
    factorList.add("2,2,2");
    factorList.add("3,3");
    factorList.add("2,5");
    factorList.add("1,11");
    factorList.add("2,2,3");
    factorList.add("1,13");
    factorList.add("2,7");
    factorList.add("3,5");
    factorList.add("2,2,2,2");
    factorList.add("1,17");
    factorList.add("2,3,3");
    factorList.add("1,19");
    factorList.add("2,2,5");
    factorList.add("3,7");
    factorList.add("2,11");
    factorList.add("1,23");
    factorList.add("2,2,2,3");
    factorList.add("5,5");
    factorList.add("2,13");
    factorList.add("3,3,3");
    factorList.add("2,2,7");
    factorList.add("1,29");
    factorList.add("2,3,5");
    factorList.add("1,31");
    factorList.add("2,2,2,2,2");
    factorList.add("3,11");
    factorList.add("2,17");
    factorList.add("5,7");
    factorList.add("2,2,3,3");
    factorList.add("1,37");
    factorList.add("2,19");
    factorList.add("3,13");
    factorList.add("2,2,2,5");

    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for (int a0 = 0; a0 < t; a0++) {
      int n = in.nextInt();

      long number = 1;
      for (int i = 1; i <= n; i++) {

        if (number % i == 0)
          continue;

        String factors = factorList.get(i);
        String[] integerFactors = factors.split(",");
        for (String integerFactor : integerFactors) {
          int num = Integer.parseInt(integerFactor);

          number = number * num;
          if (number % i == 0)
            break;
        }
      }

      System.out.println(number);
    }

  }

}
