package codility.painless;

/**
 * Created by nikoo28 on 2019-08-25 16:31
 */

class BinaryGap {

  public int solution(int N) {
    // write your code in Java SE 8

    String binaryString = Integer.toBinaryString(N);
    System.out.println(binaryString);

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

      if(gap > largestGap) largestGap = gap;
    }

    return largestGap;
  }

  public static void main(String[] args) {
    BinaryGap binaryGap = new BinaryGap();
    System.out.println(binaryGap.solution(15));
    System.out.println(binaryGap.solution(20));
    System.out.println(binaryGap.solution(529));
    System.out.println(binaryGap.solution(9));
    System.out.println(binaryGap.solution(1));
    System.out.println(binaryGap.solution(32));
    System.out.println(binaryGap.solution(1041));
    System.out.println(binaryGap.solution(2147483647));
  }

}
