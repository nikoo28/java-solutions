package codility.painless;

/**
 * Created by nikoo28 on 2019-08-25 16:31
 */

class BinaryGap {

  int solution(int n) {
    // write your code in Java SE 8

    String binaryString = Integer.toBinaryString(n);
    // System.out.println(binaryString);

    int largestGap = 0;
    for (int i = 1; i < binaryString.length(); i++) {
      int gap = 0;
      while (binaryString.charAt(i) == '0') {
        gap++;
        i++;

        if (i == binaryString.length()) {
          gap = 0;
          break;
        }
      }

      if (gap > largestGap)
        largestGap = gap;
    }

    return largestGap;
  }

}
