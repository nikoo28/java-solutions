package hackerrank.algorithms.implementation;

/**
 * Created by nikoo28 on 3/14/21 4:34 PM
 */

public class RepeatedString {

  long repeatedString(String s, long n) {

    long strLength = s.length();

    // Count the number of 'a' in the given string
    int count = 0;
    for (int i = 0; i < strLength; i++) {
      if (s.charAt(i) == 'a') {
        ++count;
      }
    }

    long repeatedTimes = n / strLength;

    // Find the length of string left after repetitions
    long stringLeftLength = n - (strLength * repeatedTimes);

    // Count the remaining repetitions
    int extra = 0;
    for (int i = 0; i < stringLeftLength; i++) {
      if (s.charAt(i) == 'a') {
        ++extra;
      }
    }

    long totalCount = (repeatedTimes * count) + extra;

    return totalCount;
  }

}
