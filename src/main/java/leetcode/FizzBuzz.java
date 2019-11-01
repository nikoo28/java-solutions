package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nikoo28 on 9/10/17
 */
class FizzBuzz {
  public List<String> fizzBuzz(int n) {

    List<String> resultList = new ArrayList<>();

    for (int i = 1, fizz = 0, buzz = 0; i <= n; i++) {
      fizz++;
      buzz++;

      if (fizz == 3 && buzz == 5) {
        resultList.add("FizzBuzz");
        fizz = 0;
        buzz = 0;
        continue;
      }

      if (fizz == 3) {
        resultList.add("Fizz");
        fizz = 0;
        continue;
      }

      if (buzz == 5) {
        resultList.add("Buzz");
        buzz = 0;
        continue;
      }
      resultList.add(Integer.toString(i));
    }

    return resultList;
  }
}
